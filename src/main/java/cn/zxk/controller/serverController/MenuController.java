package cn.zxk.controller.serverController;

import cn.zxk.entity.serveEntity.Menu;
import cn.zxk.entity.serveEntity.RoleMenu;
import cn.zxk.entity.serveEntity.UserRole;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.mappers.serveMapper.MenuMapper;
import cn.zxk.service.DefaultUserDetails;
import cn.zxk.service.sysService.IMenuService;
import cn.zxk.service.sysService.IRoleMenuService;
import cn.zxk.service.sysService.IUserRoleService;
import cn.zxk.util.IdGenerator;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
@PreAuthorize("hasAuthority('menuManagement')")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @Autowired
    private IRoleMenuService roleMenuService;

    @Autowired
    private IUserRoleService userRoleService;

    //  @ApiOperation(value = "列出所有菜单", notes = "查找并以list形式列出所有菜单")
    @GetMapping("/list")
    public RespMessage list() {
        return RespMessage.ok("", menuService.list());
    }

//  @ApiOperation(value = "列出所有权限", notes = "查找并以菜单树的形式列出所有权限")
//  @GetMapping("/tree")
//  public List<AuthorityVO> tree() {
//    return AuthorityTreeUtil.getSubTree(null, mapper.poToVO(authorityService.findAll()));
//  }

    @ApiOperation(value = "根据条件排序分页列出所有菜单（模糊查询）", notes = "对类型为字符串的属性进行模糊查询，排序分页列出所有菜单")
    @PostMapping("/list")
    public RespMessage listByQuery(@RequestBody QueryEntity<Menu> queryEntity) {
        return menuService.query(queryEntity);
    }

////  @ApiOperation(value = "根据条件排序分页列出所有菜单（匹配查询）", notes = "一类型为字符串的属性进行匹配查询，单个字段模糊匹配即可，排序分页列出所有菜单")
//  @PostMapping("/list/matching")
//  public Page<MenuVO> listByString(@RequestBody QueryEntity<String> queryEntity)
//      throws IllegalAccessException, InstantiationException {
//    return menuService.findByString(MenuPO.class, queryEntity, mapper);
//  }

    ////  @ApiOperation(value = "获取单个菜单详情", notes = "根据id获取菜单信息")
    @GetMapping("/get/{id}")
    public RespMessage get(@PathVariable("id") String id) {
        return RespMessage.ok(menuService.getById(id));
    }

    @ApiOperation(value = "添加菜单", notes = "添加单个菜单")
    @PostMapping("/add")
    public RespMessage add(@RequestBody Menu menu) {
        DefaultUserDetails user = (DefaultUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        menu.setCreateTime(String.valueOf(System.currentTimeMillis()))
                .setCreateUserId(user.getUser().getID())
                .setCreateUserName(user.getUser().getName())
                .setID("menu-"+IdGenerator.generateShortUuid());
        if (menuService.save(menu)) {
            UserRole userRole = userRoleService.getOne(new QueryWrapper<UserRole>().eq("user_id", user.getUser().getID()));
            roleMenuService.save(new RoleMenu().setRoleId(userRole.getRoleId()).setMenuId(menu.getID()));
            return RespMessage.ok("新增成功");
        } else return RespMessage.error("新增失败");
    }

    @ApiOperation(value = "修改菜单", notes = "修改单个菜单的相关信息")
    @PostMapping("/update")
    public RespMessage update(@RequestBody Menu menu) {
        boolean flag = menuService.updateById(menu);
        if (flag) return RespMessage.ok();
        else return RespMessage.error("修改失败");
    }

    //  @ApiOperation(value = "删除菜单", notes = "根据id删除单个或多个菜单")
    @PostMapping("/delete")
    public RespMessage delete(@RequestBody List<String> ids) {
        boolean success=false;
        for (String id : ids) {
            success = menuService.remove(new QueryWrapper<Menu>()
                    .eq("id", id));
            success=roleMenuService.remove(new QueryWrapper<RoleMenu>().eq("menu_id",id));
            if (!success) return RespMessage.error("未知错误");
        }
        return RespMessage.ok("删除成功");
    }

}

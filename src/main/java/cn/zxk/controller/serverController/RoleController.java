package cn.zxk.controller.serverController;

import cn.zxk.entity.serveEntity.Role;
import cn.zxk.entity.serveEntity.RoleMenu;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.sysService.IRoleMenuService;
import cn.zxk.service.sysService.IRoleService;
import cn.zxk.service.sysService.impl.RoleMenuServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(description = "角色管理")
@RestController
@RequestMapping("/role")
@PreAuthorize("hasAuthority('roleManagement')")
public class RoleController {

    @Autowired
    IRoleService roleService;

    @Autowired
    IRoleMenuService roleMenuService;


    @ApiOperation(value = "列出所有角色", notes = "查找并以list形式列出所有角色")
    @GetMapping("/list")
    public RespMessage list() {
        return RespMessage.ok("", roleService.list());
    }

    @ApiOperation(value = "根据条件排序分页列出所有角色（模糊查询）", notes = "对类型为字符串的属性进行模糊查询，排序分页列出所有角色")
    @PostMapping("/list")
    public RespMessage listByQuery(@RequestBody QueryEntity<Role> queryEntity) {
        return roleService.query(queryEntity);
    }
    @ApiOperation(value = "获取单个角色详情", notes = "根据id获取角色详情")
    @GetMapping("/get/{id}")
    public RespMessage get(@PathVariable("id") String id) {
        return RespMessage.ok(roleService.getById(id));
    }

    //
    @ApiOperation(value = "添加角色", notes = "添加单个角色")
    @PostMapping("/add")
    public RespMessage add(@RequestBody @Valid Role role) {
        System.out.println(role);
        return RespMessage.ok("新增成功");
    }

    //
//  @ApiOperation(value = "修改角色", notes = "修改单个角色的相关信息")
//  @PostMapping("/update")
//  public RoleVO update(@RequestBody @Valid RoleVO vo) {
//    vo.setAuthorities(null);
//    return mapper.poToVO(roleService.update(mapper.voToPO(vo), vo.getId()));
//  }
//
//  @ApiOperation(value = "关联权限", notes = "对单个角色和任意权限进行关联，id为角色id，ids为权限id集合")
//  @PostMapping("/update/authority/{id}")
//  public RoleVO updateAuthority(@PathVariable("id") String id,
//      @RequestBody(required = false) List<String> ids) {
//    RolePO rolePO = new RolePO();
//    rolePO.setId(id);
//    rolePO.setAuthorities(new ArrayList<>());
//    for (String authorityId : ids) {
//      rolePO.getAuthorities().add(new AuthorityPO().setId(authorityId));
//    }
//    return mapper.poToVO(roleService.update(rolePO, id));
//  }
//
    @ApiOperation(value = "关联菜单", notes = "对单个角色和任意菜单进行关联，id为角色id，ids为菜单id集合")
    @PostMapping("/update/menu/{id}")
    public RespMessage updateMenu(@PathVariable("id") String id,
                                  @RequestBody(required = false) List<String> ids) {
        boolean success = false;
        for (String menu_id : ids) {
            success = roleMenuService.saveOrUpdate(new RoleMenu().setRoleId(id).setMenuId(menu_id), new QueryWrapper<RoleMenu>()
                    .eq("role_id", id)
                    .eq("menu_id", menu_id));
        }
        if (success) return RespMessage.ok("操作成功");
        else return RespMessage.error("关联失败");
    }
//
//  @ApiOperation(value = "删除角色", notes = "根据id删除单个或多个角色")
//  @PostMapping("/delete")
//  public RespMessage delete(@RequestBody List<String> ids) {
//    roleService.delete(ids);
//    return RespMessage.ok();
//  }
//
//  @ApiOperation("下载导入模板")
//  @GetMapping("/template")
//  public void excelTemplate(HttpServletResponse response) throws Exception {
//    roleService.template(response);
//  }
//
//  @ApiOperation("导入角色")
//  @PostMapping("/import")
//  public Object excelUpload(MultipartFile file) throws Exception {
//    roleService.upload(file, mapper);
//    return RespMessage.ok();
//  }
//
//  @ApiOperation("导出角色（excel）")
//  @PostMapping("/export/excel")
//  public void excelDownload(@RequestBody List<RoleVO> data, HttpServletResponse response)
//      throws IOException {
//    //此处仅作为示例，通过前端把导出数据传过来是不安全的。
//    //正确的做法应该是
//    //1.前端传来id等查询条件
//    //2.使用查询条件调用service查出po list
//    //3.把po list转换成vo list
//    //4.使用vo list调用导出方法
//    roleService.download(data, response);
//  }
//
//  @ApiOperation("导出角色（PDF）")
//  @PostMapping("/export/pdf")
//  public void pdfDownload(@RequestBody List<RoleVO> data, HttpServletResponse response)
//      throws IOException {
//    //此处仅作为示例，通过前端把导出数据传过来是不安全的。
//    //正确的做法应该是
//    //1.前端传来id等查询条件
//    //2.使用查询条件调用service查出po list
//    //3.把po list转换成vo list
//    //4.使用vo list调用导出方法
//    roleService.pdf(data, response);
//  }
//
//  @ApiOperation(value = "修改前端权限", notes = "以保存json字符串的形式修改保存前端权限详情")
//  @PostMapping("/update/permissions/{id}")
//  public RespMessage updatePermissions(@PathVariable("id") String id,
//      @RequestBody(required = false) JSONObject permissions) {
//      RolePO rolePO = new RolePO();
//      rolePO.setId(id);
//      rolePO.setPermissions(permissions.toJSONString());
//      return RespMessage.ok(mapper.poToVO(roleService.update(rolePO, id)));
//  }
//
//  @ApiOperation(value = "修改前端权限", notes = "以保存json字符串的形式修改保存前端权限详情")
//  @GetMapping("/get/permissions/{id}")
//  public RespMessage getPermissions(@PathVariable("id") String id) {
//    RolePO rolePO=roleService.findById(id).orElse(null);
//    if (rolePO!=null){
//      return RespMessage.ok(JSON.parseObject(rolePO.getPermissions()));
//    }else{
//      return RespMessage.error("该角色不存在");
//    }
//  }

}

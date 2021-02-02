package cn.zxk.controller;

import cn.zxk.entity.serveEntity.Menu;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.mappers.serveMapper.MenuMapper;
import cn.zxk.service.sysService.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
@PreAuthorize("hasAuthority('menuManagement')")
public class MenuController {

  @Autowired
  private IMenuService menuService;

//  @ApiOperation(value = "列出所有菜单", notes = "查找并以list形式列出所有菜单")
  @GetMapping("/list")
  public RespMessage list() {
    return RespMessage.ok("",menuService.list());
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
//
//
////  @ApiOperation(value = "获取单个菜单详情", notes = "根据id获取菜单信息")
  @GetMapping("/get/{id}")
  public RespMessage get(@PathVariable("id") String id) {
    return RespMessage.ok(menuService.getById(id));
  }
//
//  @ApiOperation(value = "添加菜单", notes = "添加单个菜单")
//  @PostMapping("/add")
//  public MenuVO add(@RequestBody MenuVO vo) {
//    MenuVO result = mapper.poToVO(menuService.add(mapper.voToPO(vo)));
//    return result;
//  }
//
  @ApiOperation(value = "修改菜单", notes = "修改单个菜单的相关信息")
  @PostMapping("/update")
  public RespMessage update(@RequestBody Menu menu) {
    boolean flag = menuService.updateById(menu);
    if(flag) return RespMessage.ok();
    else return RespMessage.error("修改失败");
  }
//
////  @ApiOperation(value = "删除菜单", notes = "根据id删除单个或多个菜单")
//  @PostMapping("/delete")
//  public RespMessage delete(@RequestBody List<String> ids) {
//    menuService.delete(ids);
//    return RespMessage.ok();
//  }

}

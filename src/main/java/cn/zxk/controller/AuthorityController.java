package cn.zxk.controller;

import cn.zxk.entity.serveEntity.Authority;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.sysService.IAuthorityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@Api(description = "权限管理")
@RestController
@RequestMapping("/authority")
@PreAuthorize("hasAuthority('authorityManagement')")
public class AuthorityController {

  @Autowired
  IAuthorityService authorityService;


  @ApiOperation(value = "列出所有权限", notes = "查找并以list形式列出所有权限")
  @GetMapping("/list")
  public RespMessage list() {
    return RespMessage.ok("",authorityService.list());
  }

//  @ApiOperation(value = "列出所有权限", notes = "查找并以菜单树的形式列出所有权限")
//  @GetMapping("/tree")
//  public List<AuthorityVO> tree() {
//    return AuthorityTreeUtil.getSubTree(null, mapper.poToVO(authorityService.findAll()));
//  }

  @ApiOperation(value = "根据条件排序分页列出所有权限（模糊查询）", notes = "类型为字符串的属性进行模糊查询，排序分页列出所有权限")
  @PostMapping("/list")
  public RespMessage listByQuery(@RequestBody QueryEntity<Authority> queryEntity) {
    return authorityService.query(queryEntity);
  }

//  @ApiOperation(value = "根据条件排序分页列出所有权限（匹配查询）", notes = "类型为字符串的属性进行匹配查询，单个字段模糊匹配即可，排序分页列出所有权限")
//  @PostMapping("/list/matching")
//  public Page<AuthorityVO> listByString(@RequestBody QueryEntity<String> queryEntity)
//      throws IllegalAccessException, InstantiationException {
//    return authorityService.findByString(AuthorityPO.class, queryEntity, mapper);
//  }
//
//
  @ApiOperation(value = "获取单个权限详情", notes = "根据id获取权限信息")
  @GetMapping("/get/{id}")
  public RespMessage get(@PathVariable("id") String id) {
    return RespMessage.ok(authorityService.getById(id));
  }
//
//  @ApiOperation(value = "获取单个权限详情", notes = "根据id获取权限及其相关子权限")
//  @GetMapping("/get/{id}")
//  public AuthorityVO get(@PathVariable("id") String id) {
//    List<AuthorityVO> voList = mapper.poToVO(authorityService.findAll());
//    AuthorityVO parent = null;
//    for (AuthorityVO vo : voList) {
//      //查找权限是子权限的时候
//      if (vo.getId().equals(id) && vo.getParentId() != null) {
//        parent = new AuthorityVO();
//        parent.setId(vo.getParentId());
//      }
//    }
//    List<AuthorityVO> result = AuthorityTreeUtil.getSubTree(parent, voList);
//    for (AuthorityVO vo : result) {
//      if (vo.getId().equals(id)) {
//        return vo;
//      }
//    }
//    return null;
//  }
//
//  @ApiOperation(value = "添加权限", notes = "添加单个权限")
//  @PostMapping("/add")
//  public AuthorityVO add(@RequestBody AuthorityVO vo) {
//    AuthorityVO result = mapper.poToVO(authorityService.add(mapper.voToPO(vo)));
//    return result;
//  }
//
  @ApiOperation(value = "修改权限", notes = "修改单个权限的相关信息")
  @PostMapping("/update")
  public RespMessage update(@RequestBody Authority authority) {
    boolean flag = authorityService.updateById(authority);
    if(flag)return RespMessage.ok();
    else return RespMessage.error("修改失败！");
  }
//
//  @ApiOperation(value = "删除权限", notes = "根据id删除单个或多个权限")
//  @PostMapping("/delete")
//  public RespMessage delete(@RequestBody List<String> ids) {
//    authorityService.delete(ids);
//    return RespMessage.ok();
//  }

}

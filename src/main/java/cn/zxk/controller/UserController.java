package cn.zxk.controller;

import cn.zxk.entity.serveEntity.User;
import cn.zxk.entity.serveEntity.enmus.UserStatus;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.Range;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.sysService.IUserService;
import cn.zxk.service.sysService.impl.UserServiceImpl;
import cn.zxk.util.StringUtil;
import cn.zxk.util.crypto.DES3Util;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import freemarker.core.ReturnInstruction;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.lang.UsesJava7;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.ExampleMatcher;
//import org.springframework.data.domain.ExampleMatcher.StringMatcher;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.crypto.spec.OAEPParameterSpec;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

//@Api(description = "用户管理")
@RestController
@RequestMapping("/user")
@PreAuthorize("hasAuthority('userManagement')")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

      @ApiOperation(value = "列出所有用户", notes = "查找并以list形式列出所有用户")
    @GetMapping("/list")
    public RespMessage list() {
        return RespMessage.ok("success",userService.list());
    }

    //  @ApiOperation(value = "根据条件排序分页列出所有用户（模糊查询）", notes = "对类型为字符串的属性进行模糊查询，排序分页列出所有用户")
    @PostMapping("/list")
    public RespMessage listByQuery(@RequestBody QueryEntity<User> query) {
        return userService.query(query);
    }

//  @ApiOperation(value = "根据条件排序分页列出所有用户（匹配查询）", notes = "类型为字符串的属性进行匹配查询，单个字段模糊匹配即可，排序分页列出所有用户")
//  @PostMapping("/list/matching")
//  public Page<User> listByString(@RequestBody QueryEntity<String> queryEntity)
//      throws IllegalAccessException, InstantiationException {
//    return userService.query(queryEntity);
//  }
//
//
//  @ApiOperation(value = "获取单个用户详情", notes = "根据id获取用户详情")
  @GetMapping("/get/{id}")
  public RespMessage get(@PathVariable("id") String id) {
    return RespMessage.ok("",userService.getById(id));
  }
//
  @ApiOperation(value = "添加用户", notes = "添加单个用户")
  @PostMapping("/add")
  public RespMessage add(@RequestBody @Valid User user) throws IOException {
    //设置初始密码为123456
    //设置为新角色
    user.setStatus(UserStatus.AVAILABLE.getCode());
    try {

        return RespMessage.ok("",userService.save(user));
    }catch (Exception e){
        return RespMessage.error(e.toString());
    }
  }
//
//  @ApiOperation(value = "修改用户", notes = "修改单个用户的相关信息")
//  @PostMapping("/update")
//  public RespMessage update(@RequestBody @Valid User user)
//      throws GeneralSecurityException, UnsupportedEncodingException {
//    user.setRoles(null);
//    user.setName(null);//不可修改
//    if (user.getPassword() != null) {
//      user.setPassword(passwordEncoder.encode(DES3Util.decode(vo.getPassword())));
//    }
//    return mapper.poToVO(userService.update(mapper.voToPO(vo), vo.getId()));
//  }
//
  @ApiOperation(value = "关联角色", notes = "对单个用户和任意权限进行关联，id为用户id，ids为角色id集合")
  @PostMapping("/update/role/{id}")
  public RespMessage updateRole(@PathVariable("id") String id,
      @RequestBody(required = false) List<String> ids) {
      System.out.println(id);
      System.out.println(ids);
      return null;
  }

//  @ApiOperation(value = "删除用户", notes = "根据id删除单个或多个用户")
  @PostMapping("/delete")
  public RespMessage delete(@RequestBody List<String> ids) {
    ids.forEach(id->{
        userService.removeById(new QueryWrapper<User>().eq("ID",id));
    });
    return RespMessage.ok();
  }


}

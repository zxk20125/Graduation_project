package cn.zxk.controller;

import cn.zxk.entity.serveEntity.User;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.Range;
import cn.zxk.service.sysService.IUserService;
import cn.zxk.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
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

//import javax.validation.Valid;
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
    IUserService userService;


    @Autowired
    PasswordEncoder passwordEncoder;

    //  @ApiOperation(value = "列出所有用户", notes = "查找并以list形式列出所有用户")
    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

    //  @ApiOperation(value = "根据条件排序分页列出所有用户（模糊查询）", notes = "对类型为字符串的属性进行模糊查询，排序分页列出所有用户")
    @PostMapping("/list")
    public Page<User> listByQuery(@RequestBody QueryEntity<User> query) {
        System.out.println(query.getQuery());
        System.out.println(query.getOrders());
        userService.page(new Page<User>(query.getPageNum(),query.getPageSize()),new QueryWrapper<User>()
                            .like(!StringUtil.isBlank(query.getQuery().getName()),"NAME",query.getQuery().getName())
                            .like(!StringUtil.isBlank(query.getQuery().getStatus()),"STATUS",query.getQuery().getStatus())
                            .orderBy(true,!query.getOrders().get(0).getOrder().equals("desc"),query.getOrders().get(0).getOrder(),query.getOrders().get(0).getOrder())
                            .between(!query.getRanges().get(0).getFrom().equals("null")&&query.getRanges().get(0).getTo().equals("null"),)
        )

//      System.out.println(query);
//      Page<User> page=new Page<>();
//      userService.page(page);
//    ExampleMatcher matcher = ExampleMatcher.matching()
//        .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
//        .withIgnoreCase().withIgnorePaths("password");
//    Example<UserPO> example = Example.of(mapper.voToPO(query.getQuery()), matcher);
//    List<Range> ranges = query.getRanges();
//    Pageable page = query.getPage();
//    return userService.findAll(example, ranges, page, mapper);
        return null;
    }

//  @ApiOperation(value = "根据条件排序分页列出所有用户（匹配查询）", notes = "类型为字符串的属性进行匹配查询，单个字段模糊匹配即可，排序分页列出所有用户")
//  @PostMapping("/list/matching")
//  public Page<UserVO> listByString(@RequestBody QueryEntity<String> queryEntity)
//      throws IllegalAccessException, InstantiationException {
//    return userService.findByString(UserPO.class, queryEntity, mapper);
//  }
//
//
//  @ApiOperation(value = "获取单个用户详情", notes = "根据id获取用户详情")
//  @GetMapping("/get/{id}")
//  public UserVO get(@PathVariable("id") String id) {
//    return mapper.poToVO(userService.findById(id).orElse(null));
//  }
//
//  @ApiOperation(value = "添加用户", notes = "添加单个用户")
//  @PostMapping("/add")
//  public UserVO add(@RequestBody @Valid UserVO vo) throws IOException {
//    //设置初始密码为123456
//    vo.setPassword(passwordEncoder.encode("123456"));
//    //设置为新角色
//    vo.setStatus(UserStatus.AVAILABLE.getCode());
//    return mapper.poToVO(userService.add(mapper.voToPO(vo)));
//  }
//
//  @ApiOperation(value = "修改用户", notes = "修改单个用户的相关信息")
//  @PostMapping("/update")
//  public UserVO update(@RequestBody @Valid UserVO vo)
//      throws GeneralSecurityException, UnsupportedEncodingException {
//    vo.setRoles(null);
//    vo.setName(null);//不可修改
//    if (vo.getPassword() != null) {
//      vo.setPassword(passwordEncoder.encode(DES3Util.decode(vo.getPassword())));
//    }
//    return mapper.poToVO(userService.update(mapper.voToPO(vo), vo.getId()));
//  }
//
//  @ApiOperation(value = "关联角色", notes = "对单个用户和任意权限进行关联，id为用户id，ids为角色id集合")
//  @PostMapping("/update/role/{id}")
//  public UserVO updateRole(@PathVariable("id") String id,
//      @RequestBody(required = false) List<String> ids) {
//    UserPO userPO = new UserPO().setId(id).setRoles(new ArrayList<>());
//    for (String roleId : ids) {
//      RolePO rolePO = new RolePO();
//      rolePO.setId(roleId);
//      userPO.getRoles().add(rolePO);
//    }
//    return mapper.poToVO(userService.update(userPO, id));
//  }
//
//  @ApiOperation(value = "删除用户", notes = "根据id删除单个或多个用户")
//  @PostMapping("/delete")
//  public RespMessage delete(@RequestBody List<String> ids) {
//    userService.delete(ids);
//    return RespMessage.ok();
//  }


}
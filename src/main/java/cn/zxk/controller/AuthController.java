package cn.zxk.controller;

import cn.zxk.entity.RespMessage;
import cn.zxk.service.DefaultUserDetails;
import cn.zxk.service.sysService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@Api(description = "用户相关功能")
@RestController
public class AuthController {

  @Autowired
  IUserService userService;

  @Autowired
  PasswordEncoder passwordEncoder;


//  UserMapper mapper = UserMapper.INSTANCE;

//  @ApiOperation("用户注册")
//  @PostMapping("/register")
//  public RespMessage register(@RequestBody @Valid UserVO vo) {
//    vo.setStatus("1");
//    vo.setPassword(passwordEncoder.encode(vo.getPassword()));
//    userService.add((mapper.voToPO(vo)));
//    return RespMessage.ok();
//  }
//
//  @ApiOperation("用户修改信息")
//  @PostMapping("/updateUserInfo")
//  public RespMessage update(@RequestBody @Valid UserVO vo) {
//    vo.setPassword(null);
//    if (vo.getId().equals(AuthUtils.getCurrentUserId())) {
//      userService.update((mapper.voToPO(vo)), vo.getId());
//      return RespMessage.ok();
//    } else {
//      return RespMessage.build(false, HttpServletResponse.SC_FORBIDDEN, "没有权限修改他人信息");
//    }
//  }
//
//  @ApiOperation("用户修改密码")
//  @PostMapping("/updateUserPassword")
//  public RespMessage update(@RequestBody @Valid UpdatePasswordQuery query,
//      HttpServletRequest request,
//      HttpServletResponse response)
//      throws IOException {
//    UserPO userPO = userService.findById(AuthUtils.getCurrentUserId()).get();
//    if (!passwordEncoder.matches(query.getOldPassword(), userPO.getPassword())) {
//      return RespMessage.error("旧密码输入错误");
//    } else if (!query.getPassword1().equals(query.getPassword2())) {
//      return RespMessage.error("两次输入密码不一样");
//    } else {
//      userPO.setPassword(passwordEncoder.encode(query.getPassword1()));
//      userService.update(userPO, userPO.getId());
//      new SecurityContextLogoutHandler()
//          .logout(request, response, SecurityContextHolder.getContext().getAuthentication());
//      return RespMessage.ok("修改成功，请重新登录。");
//    }
//  }

//  @ApiOperation("获取当前登录用户信息")
  @GetMapping("/current")
  public Object current() {
    DefaultUserDetails details= (DefaultUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    details.getUser().setPassword(null);
    RespMessage ok = RespMessage.ok(null, details);
    return ok;
  }

}

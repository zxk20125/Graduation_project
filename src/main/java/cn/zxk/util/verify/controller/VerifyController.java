package cn.zxk.util.verify.controller;

import cn.zxk.util.ServletUtil;
import cn.zxk.util.verify.Captcha;
import cn.zxk.util.verify.GifCaptcha;
import cn.zxk.util.verify.SpecCaptcha;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import com.mysql.cj.protocol.WatchableOutputStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Api(description = "获取验证码")
@RestController
@RequestMapping("/verify")
public class VerifyController {

  private static Integer DEFAULT_HEIGHT = 33;
  private static Integer DEFAULT_WIDTH = 146;

  /**
   * 获取验证码（jpg版本）
   */
//  @ApiOperation(value = "获取jpg验证码", notes = "不输入宽高即为默认宽高")
  @GetMapping("/jpgCode")
  public void getJPGCode(@RequestParam(required = false) Integer width,
      @RequestParam(required = false) Integer height,
      HttpServletResponse response,
      HttpServletRequest request) {
    System.out.println("获取验证码");
    if (height == null && width == null) {
      height = DEFAULT_HEIGHT;
      width = DEFAULT_WIDTH;
    } else if (height == null && width != null) {
      height = width;
    } else if (height != null && width == null) {
      width = height;
    }
    try {
      response.setHeader("Pragma", "No-cache");
      response.setHeader("Cache-Control", "no-cache");
      response.setDateHeader("Expires", 0);
      response.setContentType("image/jpg");
      /**
       * jgp格式验证码
       * 宽，高，位数。
       */
      Captcha captcha = new SpecCaptcha(width, height, 4);

      request.getSession(true);

      //输出
      captcha.out(response.getOutputStream());
      ServletUtil.setSessionAttribute("aweb-verify-code-session",
          captcha.text().toLowerCase());

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * 获取验证码（Gif版本）
   */
//  @ApiOperation(value = "获取gif验证码", notes = "不输入宽高即为默认宽高")
  @GetMapping("/gifCode")
  public void getGifCode(@RequestParam(required = false) Integer width,
                         @RequestParam(required = false) Integer height, HttpServletResponse response,
                         HttpServletRequest request) {
    if (height == null && width == null) {
      height = DEFAULT_HEIGHT;
      width = DEFAULT_WIDTH;
    } else if (height == null && width != null) {
      height = width;
    } else if (height != null && width == null) {
      width = height;
    }
    try {
      response.setHeader("Pragma", "No-cache");
      response.setHeader("Cache-Control", "no-cache");
      response.setDateHeader("Expires", 0);
      response.setContentType("image/gif");
      /**
       * gif格式动画验证码
       * 宽，高，位数。
       */
      Captcha captcha = new GifCaptcha(width, height, 4);

      request.getSession(true);

      //输出
      captcha.out(response.getOutputStream());

      ServletUtil.setSessionAttribute("aweb-verify-code-session",
          captcha.text().toLowerCase());

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}

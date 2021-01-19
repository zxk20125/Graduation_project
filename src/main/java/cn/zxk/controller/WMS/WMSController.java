package cn.zxk.controller.WMS;

import cn.zxk.entity.TStaff;
import cn.zxk.service.ITStaffService;
import cn.zxk.util.crypto.DES3Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author Chickck
 * @date 2021/1/6
 */
@Controller
public class WMSController {
    @Autowired
    private ITStaffService staffService;

    @RequestMapping("/WMS/login")
    @ResponseBody
    public HashMap<String, Object> login(@RequestParam Map<String, Object> reqMessage) {
        TStaff admin = new TStaff();
        HashMap<String, Object> loginStatus = new HashMap<>();
        HashMap<String, Object> login_obj = new HashMap<>();
        Object username = reqMessage.get("username");
        Object password = reqMessage.get("password");
        Object code = reqMessage.get("code");
        try {
            reqMessage.forEach((key, value) -> System.out.println(key));
            String login_status = staffService.login(username.toString(), DES3Util.decode(password.toString()));
            System.out.println(login_status);
            loginStatus.put("msg", login_status);
            if (login_status.equals("success")) {
                loginStatus.put("success", true);
                loginStatus.put("status", 200);
                login_obj.put("token", "admin");
                loginStatus.put("obj", login_obj);
            }
            return loginStatus;
        } catch (Exception e) {
            e.printStackTrace();
            loginStatus.put("status", "unknown_error");
        }
        return loginStatus;
    }

    @RequestMapping("/WMS/current")
    @ResponseBody
    public HashMap<String, Object> index(@RequestHeader("X-CSRF-TOKEN") String role) {
        System.out.println(role);
        HashMap<String, Object> index_status = new HashMap<>();
        HashMap<String, Object> obj = new HashMap<>();
        index_status.put("success", true);
        index_status.put("status", 200);
        index_status.put("obj",obj);
        return index_status;
    }
    @RequestMapping("/WMS/logout")
    @ResponseBody
    public HashMap<String,Object> logout(){
        HashMap<String, Object> logout_status = new HashMap<>();
        logout_status.put("msg","注销成功");
        logout_status.put("status",200);
        logout_status.put("success",true);
        return logout_status;
    }
}

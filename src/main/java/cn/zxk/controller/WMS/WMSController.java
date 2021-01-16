package cn.zxk.controller.WMS;

import cn.zxk.entity.TStaff;
import cn.zxk.service.ITStaffService;
import cn.zxk.util.crypto.DES3Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public HashMap<String, Object> login(@RequestParam Map<String,Object> reqMessage) {
        TStaff admin = new TStaff();
        HashMap<String, Object> loginStatus = new HashMap<>();
        HashMap<String, Object> login_obj = new HashMap<>();
        Object username = reqMessage.get("username");
        Object password = reqMessage.get("password");
        Object code = reqMessage.get("code");
        try {
            reqMessage.forEach((key,value)-> System.out.println(key));
            String login_status = staffService.login(username.toString(), DES3Util.decode(password.toString()));
            System.out.println(login_status);
            loginStatus.put("status",login_status);
            if(login_status.equals("success")){
                loginStatus.put("success",true);
                login_obj.put("token","admin");
                loginStatus.put("obj",login_obj);
            }
            return loginStatus;
        }catch (Exception e){
            e.printStackTrace();
            loginStatus.put("status","unknown_error");
        }
        return loginStatus;
    }
    @RequestMapping("/WMS/index")
    public String index()
}

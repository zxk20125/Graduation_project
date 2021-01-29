//package cn.zxk.controller.WMS;
//
//import cn.zxk.entity.appEntity.TStaff;
//import cn.zxk.service.DefaultUserDetails;
//import cn.zxk.service.appService.ITStaffService;
//import cn.zxk.util.crypto.DES3Util;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * 功能描述：
// *
// * @author Chickck
// * @date 2021/1/6
// */
//@RestController
//public class WMSController {
//    @Autowired
//    private ITStaffService staffService;
//
//    @GetMapping("/current")
//    public Object current() {
//        DefaultUserDetails details= (DefaultUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        details.getUser().setPassword(null);
//        System.out.println(details);
//        return details;
//    }
//
//    @RequestMapping("/WMS/logout")
//    @ResponseBody
//    public HashMap<String,Object> logout(){
//        HashMap<String, Object> logout_status = new HashMap<>();
//        logout_status.put("msg","注销成功");
//        logout_status.put("status",200);
//        logout_status.put("success",true);
//        return logout_status;
//    }
//}

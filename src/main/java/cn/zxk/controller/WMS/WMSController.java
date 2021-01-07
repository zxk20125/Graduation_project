package cn.zxk.controller.WMS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述：
 *
 * @author Chickck
 * @date 2021/1/6
 */
@Controller
public class WMSController {

    @RequestMapping("/WMS")
    public String index() {
        System.out.println(111);
        return "houtaiView/index";
    }
}

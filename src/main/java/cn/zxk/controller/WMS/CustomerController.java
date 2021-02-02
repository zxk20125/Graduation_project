package cn.zxk.controller.WMS;

import cn.zxk.service.appService.ITCustomerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * 功能描述：
 *
 * @author Chickck
 * @date 2021/1/19
 */
@Controller
public class CustomerController {
    @Autowired
    private ITCustomerService customerService;
    @RequestMapping("/index")
    public String index() {
        return "/dist/index.html";
    }
}

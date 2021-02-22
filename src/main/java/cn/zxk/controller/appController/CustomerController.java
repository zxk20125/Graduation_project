package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TCustomer;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.server.authentication.ReactivePreAuthenticatedAuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述：
 *
 * @author Chickck
 * @date 2021/1/19
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ITCustomerService customerService;


    @GetMapping("/list")
    public RespMessage list() {
        List<TCustomer> customers = customerService.list();
        if(null!=customers)
            return RespMessage.ok(customers);
        else return RespMessage.error("查询失败");
    }
}

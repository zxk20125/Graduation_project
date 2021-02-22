package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TCustomer;
import cn.zxk.entity.serveEntity.User;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.server.authentication.ReactivePreAuthenticatedAuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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


    @PostMapping("/list")
    public RespMessage list(@RequestBody QueryEntity<TCustomer> query) {
        TCustomer customer = query.getQuery();
        System.out.println(customer.getCustomerName());
        List<TCustomer> customers = customerService.list();
        HashMap<String, Object> records = new HashMap<>();
        records.put("records",customers);
        if(null!=customers)
            return RespMessage.ok(records);
        else return RespMessage.error("查询失败");
    }
}

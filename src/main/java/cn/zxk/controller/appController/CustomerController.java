package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TCustomer;
import cn.zxk.entity.serveEntity.User;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITCustomerService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
@RequestMapping("/customerInfo")
public class CustomerController {
    @Autowired
    private ITCustomerService customerService;


    @PostMapping("/list")
    public RespMessage list(@RequestBody QueryEntity<TCustomer> query) {
        return RespMessage.ok(customerService.selectQuery(query));
    }
    @GetMapping("/get/{customerId}")
    public RespMessage list(@PathVariable String customerId) {
        return RespMessage.ok(customerService.getById(customerId));
    }
    @PostMapping("/edit")
    public RespMessage edit(@RequestBody TCustomer customer){
        if(customerService.updateById(customer))return RespMessage.ok();
        return RespMessage.error("编辑失败");
    }
    @PostMapping("/add")
    public RespMessage add(@RequestBody TCustomer customer){
        if(customerService.save(customer))return RespMessage.ok();
        return RespMessage.error("新增失败");
    }
}

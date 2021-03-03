package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TOrder;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 功能描述：
 *
 * @author Chickck
 * @date 2021/3/2
 */
@RestController
@RequestMapping("/orderInfo")
public class OrderInfoController {
    
    @Autowired
    private ITOrderService orderService;

    @PostMapping("/list")
    public RespMessage list(@RequestBody QueryEntity<TOrder> queryEntity){
        return RespMessage.ok(orderService.selectPage(queryEntity));
    }
    @GetMapping("/get/{orderId}")
    public RespMessage get(@PathVariable("orderId") String id){
        return RespMessage.ok(orderService.selectById(id));
    }

}

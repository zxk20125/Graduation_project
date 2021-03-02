package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TOrder;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * π¶ƒ‹√Ë ˆ£∫
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
}

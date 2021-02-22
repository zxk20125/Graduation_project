package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TWaybill;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITWaybillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/billInfo")
public class WayBillController {

    @Autowired
    private ITWaybillService waybillService;


    @PostMapping("/list")
    public RespMessage list(@RequestBody QueryEntity<TWaybill> queryEntity) {
        List<TWaybill> waybills = waybillService.list();
        if (null!=waybills) return RespMessage.ok(waybills);
        else return RespMessage.error("查询失败");
    }

}

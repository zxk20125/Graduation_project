package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TShipAddress;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITShipAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipAddressInfo")
public class ShipAddressController {

    @Autowired
    private ITShipAddressService shipAddressService;

    @PostMapping("/list")
    public RespMessage list(@RequestBody QueryEntity<TShipAddress> queryEntity){
        List<TShipAddress> shipAddresses = shipAddressService.list();
        if(null!= shipAddresses)
            return RespMessage.ok(shipAddresses);
        else return RespMessage.error("查询失败！");
    }

}

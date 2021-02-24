package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TShipAddress;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITShipAddressService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipAddressInfo")
public class ShipAddressController {

    @Autowired
    private ITShipAddressService shipAddressService;

    @PostMapping("/list")
    public RespMessage list(@RequestBody QueryEntity<TShipAddress> queryEntity){
        return RespMessage.ok(shipAddressService.selectPage(queryEntity));
    }

    @PostMapping("/add")
    public RespMessage add(@Validated TShipAddress shipAddress){
        return null;
    }
}

package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TShipAddress;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITShipAddressService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public RespMessage add(@RequestBody @Valid TShipAddress shipAddress){
        if(shipAddressService.save(shipAddress)) return RespMessage.ok();
        else return RespMessage.error("新增失败");
    }
    @GetMapping("/get/{shipAddressId}")
    public RespMessage get(@PathVariable("shipAddressId") String id) {
        return RespMessage.ok(shipAddressService.getById(id));
    }
    @PostMapping("/delete")
    public RespMessage delete(@RequestBody  List<String> ids){
        if(shipAddressService.removeByIds(ids))return RespMessage.ok();
        return RespMessage.error("删除失败");
    }
}

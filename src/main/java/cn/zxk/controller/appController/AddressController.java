package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TAddress;
import cn.zxk.entity.appEntity.TCustomer;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.impl.TAddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * 功能描述：
 *
 * @author Chickck
 * @date 2021/1/6
 */
@RestController
@RequestMapping("/addressInfo")
public class AddressController {
    @Autowired
    private TAddressServiceImpl addressService;

    @PostMapping("/list")
    public RespMessage list(@RequestBody QueryEntity<TAddress> query) {
        return RespMessage.ok(addressService.selectStaff(query));
    }
}

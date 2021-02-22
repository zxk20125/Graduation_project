package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TAddress;
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
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private TAddressServiceImpl addressService;

    @PostMapping("/list")
    public RespMessage list() {
        List<TAddress> list = addressService.list();
        if (null != list) return RespMessage.ok(list);
        else return RespMessage.error("查询失败");
    }

    @RequestMapping("/WMS/logout")
    @ResponseBody
    public HashMap<String, Object> logout() {
        HashMap<String, Object> logout_status = new HashMap<>();
        logout_status.put("msg", "注销成功");
        logout_status.put("status", 200);
        logout_status.put("success", true);
        return logout_status;
    }
}

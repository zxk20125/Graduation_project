package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TAddress;
import cn.zxk.entity.appEntity.TStaff;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITStaffService;
import cn.zxk.service.appService.impl.TAddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staffInfo")
public class StaffInfoController {
    @Autowired
    private ITStaffService staffService;

    @PostMapping("/list")
    public RespMessage list(@RequestBody QueryEntity<TStaff> query) {
        return RespMessage.ok(staffService.selectStaff(query));
    }

    @GetMapping("/get/{staffId}")
    public RespMessage get(@PathVariable("staffId") String id) {
        return RespMessage.ok(staffService.getById(id));
    }
}

package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TDot;
import cn.zxk.entity.appEntity.TStaff;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITDotService;
import cn.zxk.service.appService.ITStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branchInfo")
public class BranchInfoController {

    @Autowired
    private ITDotService dotService;

    @PostMapping("/list")
    public RespMessage list(@RequestBody QueryEntity<TDot> query) {
        return RespMessage.ok(dotService.selectPage(query));
    }
    @GetMapping("/list")
    public RespMessage list() {
        return RespMessage.ok(dotService.list());
    }
    @GetMapping("/get/{branchId}")
    public RespMessage get(@PathVariable("branchId") String id) {
        return RespMessage.ok(dotService.getById(id));
    }
}

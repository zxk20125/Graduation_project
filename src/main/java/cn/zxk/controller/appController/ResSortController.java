package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TResSort;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITResSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resSortInfo")
public class ResSortController {
    @Autowired
    private ITResSortService resSortService;

    @PostMapping("/list")
    public RespMessage list(@RequestBody QueryEntity<TResSort> queryEntity){
        return RespMessage.ok(resSortService.selectPage(queryEntity));
    }

    @PostMapping("/add")
    public RespMessage add(@Validated TResSort resSort){
        return null;
    }

    @GetMapping("/get/{resSortId}")
    public RespMessage get(@PathVariable("resSortId") String id) {
        return RespMessage.ok(resSortService.getById(id));
    }

    @PostMapping("/delete")
    public RespMessage delete(@RequestBody List<String> ids){
        if(resSortService.removeByIds(ids))return RespMessage.ok();
        return RespMessage.error("删除失败");
    }
}

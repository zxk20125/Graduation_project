package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TFeedback;
import cn.zxk.entity.appEntity.TShipAddress;
import cn.zxk.entity.appEntity.TStaff;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITFeedbackService;
import cn.zxk.service.appService.ITShipAddressService;
import com.sun.corba.se.spi.orb.ParserImplBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedBackInfo")
public class FeedBackController {

    @Autowired
    private ITFeedbackService feedbackService;

    @PostMapping("/list")
    public RespMessage list(@RequestBody QueryEntity<TFeedback> queryEntity){
        return RespMessage.ok(feedbackService.selectPage(queryEntity));
    }
    @PostMapping("/delete")
    public RespMessage delete(@RequestBody List<String> ids){
        if (feedbackService.removeByIds(ids))return RespMessage.ok();
        return RespMessage.error("删除失败");
    }

}

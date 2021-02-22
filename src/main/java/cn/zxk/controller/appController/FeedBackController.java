package cn.zxk.controller.appController;

import cn.zxk.entity.appEntity.TFeedback;
import cn.zxk.entity.appEntity.TShipAddress;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.service.appService.ITFeedbackService;
import cn.zxk.service.appService.ITShipAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedBackInfo")
public class FeedBackController {

    @Autowired
    private ITFeedbackService feedbackService;

    @GetMapping("/list")
    public RespMessage list(){
        List<TFeedback> feedbacks = feedbackService.list();
        if(null!= feedbacks)
            return RespMessage.ok(feedbacks);
        else return RespMessage.error("查询失败！");
    }
}

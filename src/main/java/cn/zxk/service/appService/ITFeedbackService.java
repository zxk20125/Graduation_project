package cn.zxk.service.appService;

import cn.zxk.entity.appEntity.TFeedback;
import cn.zxk.entity.utilEntity.QueryEntity;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Chick
 * @since 2021-01-16
 */
public interface ITFeedbackService extends IService<TFeedback> {
    Page<TFeedback> selectPage(QueryEntity<TFeedback> queryEntity);
}

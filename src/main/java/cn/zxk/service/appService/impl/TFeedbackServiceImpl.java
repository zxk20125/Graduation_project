package cn.zxk.service.appService.impl;

import cn.zxk.entity.appEntity.TFeedback;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.mappers.appMapper.TFeedbackMapper;
import cn.zxk.service.appService.ITFeedbackService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-16
 */
@Service
public class TFeedbackServiceImpl extends ServiceImpl<TFeedbackMapper, TFeedback> implements ITFeedbackService {

    @Override
    public Page<TFeedback> selectPage(QueryEntity<TFeedback> queryEntity) {
        return this.baseMapper.selectPage(new Page<>(queryEntity.getPageNum(),queryEntity.getPageSize()),null);
    }
}

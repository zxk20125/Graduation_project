package cn.zxk.mappers.appMapper;

import cn.zxk.entity.appEntity.TFeedback;
import cn.zxk.entity.utilEntity.QueryEntity;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.*;


/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Chick
 * @since 2021-01-06
 */
public interface TFeedbackMapper extends BaseMapper<TFeedback> {

    @Select("select * from t_feedback")
    @Results({
            @Result(property = "loginName", column = "customer_id", one = @One(select = "cn.zxk.mappers.appMapper.TCustomerMapper.getLoginName")),
            @Result(property = "customerPhone", column = "customer_id", one = @One(select = "cn.zxk.mappers.appMapper.TCustomerMapper.getCustomerPhone"))
    })
    <E extends IPage<TFeedback>> E selectPage(E page, @Param("ew") Wrapper<TFeedback> queryWrapper);
}

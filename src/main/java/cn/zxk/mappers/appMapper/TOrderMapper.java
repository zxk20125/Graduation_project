package cn.zxk.mappers.appMapper;

import cn.zxk.entity.appEntity.TAddress;
import cn.zxk.entity.appEntity.TOrder;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.*;

import java.io.Serializable;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Chick
 * @since 2021-01-06
 */
public interface TOrderMapper extends BaseMapper<TOrder> {

    @Select("select * from t_order")
    @Results({
            @Result(property = "loginName",column = "customer_id",one=@One(select = "cn.zxk.mappers.appMapper.TCustomerMapper.getLoginName"))
    })
    <E extends IPage<TOrder>> E selectPage(E page, @Param("ew") Wrapper<TOrder> queryWrapper);

    @Select("select * from t_order where order_id = #{id}")
    @Results({
            @Result(property = "loginName",column = "customer_id",one=@One(select = "cn.zxk.mappers.appMapper.TCustomerMapper.getLoginName"))
    })
    TOrder selectById(Serializable id);
}

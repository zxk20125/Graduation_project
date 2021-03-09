package cn.zxk.mappers.appMapper;

import cn.zxk.entity.appEntity.TCustomer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Chick
 * @since 2021-01-05
 */
public interface TCustomerMapper extends BaseMapper<TCustomer> {

    @Select("select customer_login_name from t_customer where customer_id = #{id}")
    String getLoginName(int customerId);

    @Select("select customer_phone from t_customer where customer_id = #{id}")
    String getCustomerPhone(int customerId);
}

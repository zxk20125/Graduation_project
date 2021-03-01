package cn.zxk.mappers.appMapper;

import cn.zxk.entity.appEntity.TAddress;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.*;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Chick
 * @since 2021-01-05
 */
public interface TAddressMapper extends BaseMapper<TAddress> {


    @Select("select * from t_address")
    @Results({
        @Result(property = "loginName",column = "customer_id",one=@One(select = "cn.zxk.mappers.appMapper.TCustomerMapper.getLoginName"))
    })
    <E extends IPage<TAddress>> E selectPage(E page, @Param("ew") Wrapper<TAddress> queryWrapper);

    @Select({"<script>",
            "SELECT * FROM t_address",
            "WHERE 1=1",
            "<if test=\" null!=#{customer_id} and '' != #{customer_id}\">",
            "AND customer_id = #{customer_id}",
            "</if>",
            "</script>"})
    @Results({
            @Result(property = "loginName",column = "customer_id",one=@One(select = "cn.zxk.mappers.appMapper.TCustomerMapper.getLoginName"))
    })
    <E extends IPage<TAddress>> E selectPage1(E page, @Param("customer_id") Integer id);

}

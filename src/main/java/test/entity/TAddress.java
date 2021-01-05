package .test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import 你自己的父类实体,没有就不用设置!;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Chick
 * @since 2021-01-05
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TAddress extends 你自己的父类实体,没有就不用设置! {

    private static final long serialVersionUID = 1L;

    /**
     * 地址编号
     */
    @TableId(value = "address_id", type = IdType.AUTO)
    private Integer addressId;

    /**
     * 客户编号
     */
    private Integer customerId;

    /**
     * 姓名
     */
    private String addressName;

    /**
     * 地址
     */
    private String address;

    /**
     * 联系号码
     */
    private String phone;


}

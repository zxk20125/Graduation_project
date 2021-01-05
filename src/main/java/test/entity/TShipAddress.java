package .test.entity;

import java.math.BigDecimal;
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
public class TShipAddress extends 你自己的父类实体,没有就不用设置! {

    private static final long serialVersionUID = 1L;

    /**
     * 运送地址定价
     */
    @TableId(value = "ship_address_id", type = IdType.AUTO)
    private Integer shipAddressId;

    /**
     * 始点
     */
    private String startAddress;

    /**
     * 终点
     */
    private String endAddress;

    /**
     * 运送地址定价
     */
    private BigDecimal shipAddressMoney;


}

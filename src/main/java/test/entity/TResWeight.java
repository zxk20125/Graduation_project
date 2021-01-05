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
public class TResWeight extends 你自己的父类实体,没有就不用设置! {

    private static final long serialVersionUID = 1L;

    /**
     * 物品重量编号
     */
    @TableId(value = "res_weight_id", type = IdType.AUTO)
    private Integer resWeightId;

    /**
     * 物品重量
     */
    private Integer resWeight;

    /**
     * 物品重量定价
     */
    private BigDecimal resWeightMoney;


}

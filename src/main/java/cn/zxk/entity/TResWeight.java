package cn.zxk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author Chick
 * @since 2021-01-05
 */
@Data
//@EqualsAndHashCode(callSuper = true)
public class TResWeight{

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

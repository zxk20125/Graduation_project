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
 * @since 2021-01-06
 */
@Data
//@EqualsAndHashCode(callSuper = true)
public class TResSort{

    private static final long serialVersionUID = 1L;

    /**
     * 物品类别编号
     */
    @TableId(value = "res_sort_id", type = IdType.AUTO)
    private Integer resSortId;

    /**
     * 物品类别
     */
    private String resSort;

    /**
     * 物品定价
     */
    private BigDecimal resSortMoney;


}

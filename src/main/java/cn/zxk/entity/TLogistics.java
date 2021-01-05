package cn.zxk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;


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
public class TLogistics{

    private static final long serialVersionUID = 1L;

    /**
     * 物流编号
     */
    @TableId(value = "logistics_id", type = IdType.AUTO)
    private Integer logisticsId;

    /**
     * 运单编号
     */
    private String waybillId;

    /**
     * 员工编号
     */
    private Integer staffId;

    /**
     * 物流更新（收入，发出）
     */
    private String logisticsType;

    /**
     * 起始网点名
     */
    private String startDotName;

    /**
     * 目标网点名
     */
    private String targetDotName;

    /**
     * 填写物流信息时间
     */
    private LocalDateTime time;


}

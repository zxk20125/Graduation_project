package .test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import 你自己的父类实体,没有就不用设置!;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class TSend extends 你自己的父类实体,没有就不用设置! {

    private static final long serialVersionUID = 1L;

    /**
     * 派送编号
     */
    @TableId(value = "send_id", type = IdType.AUTO)
    private Integer sendId;

    /**
     * 运单编号
     */
    private String waybillId;

    /**
     * 员工编号
     */
    private Integer staffId;

    /**
     * 派送时间
     */
    private LocalDateTime sendTime;

    /**
     * 签收状态(0为已签收，1位拒签)
     */
    private Integer signState;

    /**
     * 操作时间
     */
    private LocalDateTime stime;

    /**
     * 拒收原因
     */
    private String rejectReasons;


}

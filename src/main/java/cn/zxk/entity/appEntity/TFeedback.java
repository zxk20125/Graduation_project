package cn.zxk.entity.appEntity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
//@EqualsAndHashCode(callSuper = true)
public class TFeedback {

    private static final long serialVersionUID = 1L;

    /**
     * 反馈编号
     */
    @TableId(value = "feedback_id", type = IdType.AUTO)
    private Integer feedbackId;

    /**
     * 客户编号
     */
    private Integer customerId;

    /**
     * 反馈内容
     */
    private String feedbackContent;

    /**
     * 联系邮箱
     */
    private String mailxbox;

    @TableField(select = false)
    private String loginName;


    @TableField(select = false)
    private String customerPhone;

}

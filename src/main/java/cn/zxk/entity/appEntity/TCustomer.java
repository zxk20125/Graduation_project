package cn.zxk.entity.appEntity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class TCustomer{

    private static final long serialVersionUID = 1L;

    /**
     * 客户编号
     */
    @TableId(value = "customer_id", type = IdType.AUTO)
    private Integer customerId;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 帐号名
     */
    private String customerLoginName;

    /**
     * 密码
     */
    private String customerPassword;

    /**
     * 年龄
     */
    private Integer customerAge;

    /**
     * 性别
     */
    private String customerSex;

    /**
     * 联系号码
     */
    private String customerPhone;

    /**
     * 身份证号码
     */
    private String idCardNo;


}

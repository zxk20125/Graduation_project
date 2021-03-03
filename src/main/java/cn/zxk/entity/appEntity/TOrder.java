package cn.zxk.entity.appEntity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
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
public class TOrder{

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    @TableId(value = "order_id")
    private String orderId;

    /**
     * 客户编号
     */
    private Integer customerId;

    /**
     * 网点编号
     */
    private Integer dotId;

    /**
     * 员工编号
     */
    private Integer staffId;

    /**
     * 寄件人姓名
     */
    private String sender;

    /**
     * 寄出地址
     */
    private String senderAddress;

    /**
     * 寄件人联系号码
     */
    private String senderPhone;

    /**
     * 收件人姓名
     */
    private String receiver;

    /**
     * 收货地址
     */
    private String receivingAddress;

    /**
     * 收件人联系号码
     */
    private String receiverPhone;

    /**
     * 预计重量
     */
    private Integer weight;

    /**
     * 物品类别
     */
    private String resSort;

    /**
     * 保价（1为保价，0为不保价）
     */
    private Integer insuredPrice;

    /**
     * 运费
     */
    private BigDecimal freight;

    /**
     * 支付方式
     */
    private String paymentMethod;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 下单时间
     */
    private LocalDateTime orderTime;

    @TableField(select = false)
    private String loginName;


}

package cn.zxk.entity;

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
public class TWaybill{

    private static final long serialVersionUID = 1L;

    /**
     * 订单运输编号
     */
    private String waybillId;

    /**
     * 订单编号
     */
    private String orderId;

    /**
     * 接单时间
     */
    private LocalDateTime receiptTime;

    /**
     * 员工确认收件时间
     */
    private LocalDateTime confirmTime;

    /**
     * 付款时间
     */
    private LocalDateTime paymentTime;

    /**
     * 取消时间
     */
    private LocalDateTime cancelTime;

    /**
     * 完成时间
     */
    private LocalDateTime finishTime;


}

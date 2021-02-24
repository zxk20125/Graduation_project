package cn.zxk.entity.appEntity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Select;
import org.springframework.boot.autoconfigure.web.WebProperties;

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
public class TAddress {

    private static final long serialVersionUID = 1L;

    /**
     * 地址编号
     */
    @TableId(value = "address_id", type = IdType.AUTO)
    private Integer addressId;

    /**
     * 客户编号
     */
    private Integer customerId;

    /**
     * 姓名
     */
    private String addressName;

    /**
     * 地址
     */
    private String address;

    /**
     * 联系号码
     */
    private String phone;

    @TableField(select = false)
    private String loginName;


}

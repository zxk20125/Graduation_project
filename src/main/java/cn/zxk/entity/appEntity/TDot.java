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
public class TDot {

    private static final long serialVersionUID = 1L;

    /**
     * 网点编号
     */
    @TableId(value = "dot_id", type = IdType.AUTO)
    private Integer dotId;

    /**
     * 网点所属城市
     */
    private String dotCity;

    /**
     * 网点地址
     */
    private String dotAddress;

    /**
     * 网点名称
     */
    private String dotName;

    /**
     * 网点联系号码
     */
    private String dotPhone;


}

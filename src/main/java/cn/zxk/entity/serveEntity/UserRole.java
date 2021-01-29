package cn.zxk.entity.serveEntity;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户和用户角色关联表
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Data
//@EqualsAndHashCode(callSuper = true)
public class UserRole{

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableField("USER_ID")
    private String userId;

    /**
     * 角色id
     */
    @TableField("ROLE_ID")
    private String roleId;


}

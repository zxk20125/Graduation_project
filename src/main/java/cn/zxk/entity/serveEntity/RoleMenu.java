package cn.zxk.entity.serveEntity;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户角色和用户菜单关联表
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Data
//@EqualsAndHashCode(callSuper = true)
public class RoleMenu {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    @TableField("ROLE_ID")
    private String roleId;

    /**
     * 菜单id
     */
    @TableField("MENU_ID")
    private String menuId;


}

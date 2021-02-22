package cn.zxk.entity.serveEntity;


import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户角色和用户菜单关联表
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Data
@Accessors(chain = true)
//@EqualsAndHashCode(callSuper = true)
public class RoleMenu {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    @TableId
    @TableField(value = "ROLE_ID", insertStrategy = FieldStrategy.NOT_EMPTY)
    private String roleId;

    /**
     * 菜单id
     */
    @TableField(value = "MENU_ID",insertStrategy = FieldStrategy.NOT_EMPTY)
    private String menuId;


}

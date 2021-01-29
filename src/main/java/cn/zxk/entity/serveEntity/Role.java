package cn.zxk.entity.serveEntity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Data
@Accessors(chain = true)
//@EqualsAndHashCode(callSuper = true)
public class Role{

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    @TableId(value = "ID")
    private String ID;

    @TableField("CREATE_TIME")
    private String createTime;

    /**
     * 创建者id
     */
    @TableField("CREATE_USER_ID")
    private String createUserId;

    /**
     * 创建者用户名
     */
    @TableField("CREATE_USER_NAME")
    private String createUserName;

    /**
     * 更新时间
     */
    @TableField("UPDATE_TIME")
    private String updateTime;

    /**
     * 更新者id
     */
    @TableField("UPDATE_USER_ID")
    private String updateUserId;

    /**
     * 更新者用户名
     */
    @TableField("UPDATE_USER_NAME")
    private String updateUserName;

    /**
     * 角色描述
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 角色名称，ROLE_开头，后接全英文，唯一
     */
    @TableField("NAME")
    private String name;

    /**
     * 前端权限
     */
    @TableField("PERMISSIONS")
    private String permissions;


}

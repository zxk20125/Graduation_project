package cn.zxk.entity.serveEntity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户菜单表
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Data
@Accessors(chain = true)
//@EqualsAndHashCode(callSuper = true)
public class Menu {

    private static final long serialVersionUID = 1L;


    @TableId(value="ID")
    private String ID;
    /**
     * 创建时间
     */
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
     * 菜单名称，驼峰式全英文，唯一
     */
    @TableField("NAME")
    private String name;

    /**
     * 排序
     */
    @TableField("ORDER_")
    private Integer order;

    /**
     * 父菜单id
     */
    @TableField("PARENT_ID")
    private String parentId;

    /**
     * 菜单显示名称
     */
    @TableField("TITLE")
    private String title;

    /**
     * 菜单描述
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 菜单图标
     */
    @TableField("ICON")
    private String icon;

    /**
     * 接口路径
     */
    @TableField("PATH")
    private String path;

    /**
     * 是否部署
     */
    @TableField("DEPLOY")
    private Boolean deploy;


}

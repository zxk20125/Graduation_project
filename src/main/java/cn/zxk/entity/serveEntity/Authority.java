package cn.zxk.entity.serveEntity;



import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;

/**
 * <p>
 * 用户权限表
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Data
//@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Authority implements GrantedAuthority {

    private static final long serialVersionUID = 1L;


    /**
     *
     */
    @TableId(value = "ID")
    private String id;

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
     * 权限描述
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 权限名称，驼峰式全英文，唯一
     */
    @TableField("NAME")
    private String name;

    /**
     * 父权限id
     */
    @TableField("PARENT_ID")
    private String parentId;


    @Override
    public String getAuthority() {
        return name;
    }
}

package cn.zxk.entity.serveEntity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Data
@Accessors(chain = true)
//@EqualsAndHashCode(callSuper = true)
public class User {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID")
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
     * 用户描述
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 用户邮箱地址
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 用户名
     */
    @TableField("NAME")
    private String name;

    /**
     * 用户昵称
     */
    @TableField("NICKNAME")
    private String nickname;

    /**
     * 用户密码，需要加密
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 用户电话号码
     */
    @TableField("PHONE")
    private String phone;

    /**
     * 用户状态，属性值详见枚举类UserStatus
     */
    @TableField("STATUS")
    private String status;
}



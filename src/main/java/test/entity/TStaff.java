package .test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import 你自己的父类实体,没有就不用设置!;
import java.time.LocalDate;
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
@EqualsAndHashCode(callSuper = true)
public class TStaff extends 你自己的父类实体,没有就不用设置! {

    private static final long serialVersionUID = 1L;

    /**
     * 员工编号
     */
    @TableId(value = "staff_id", type = IdType.AUTO)
    private Integer staffId;

    /**
     * 员工姓名
     */
    private String staffName;

    /**
     * 员工帐号
     */
    private String staffLoginName;

    /**
     * 登录密码
     */
    private String staffPassword;

    /**
     * 年龄
     */
    private Integer staffAge;

    /**
     * 性别
     */
    private String staffSex;

    /**
     * 联系号码
     */
    private String staffPhone;

    /**
     * 入职时间
     */
    private LocalDate hiredate;

    /**
     * 网点id
     */
    private Integer dotId;


}

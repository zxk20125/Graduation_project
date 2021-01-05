package cn.zxk.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.lang.reflect.Type;


/**
 * <p>
 * 
 * </p>
 *
 * @author Chick
 * @since 2021-01-04
 */
@Data
@EqualsAndHashCode()
@NoArgsConstructor
@AllArgsConstructor
public class Student{

    private static final long serialVersionUID = 1L;
    @TableId(type=IdType.ASSIGN_UUID)
    private long id;

    private Integer num;

    private String username;

    private String password;

    private String sex;

    private String brithday;

    private String chinese;

    private String english;

    private String math;


}

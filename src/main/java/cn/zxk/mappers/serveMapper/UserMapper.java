package cn.zxk.mappers.serveMapper;


import cn.zxk.entity.serveEntity.Authority;
import cn.zxk.entity.serveEntity.Role;
import cn.zxk.entity.serveEntity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from role where ID = any(select ROLE_ID from user_role where USER_ID = '${UserId}')")
    List<Role> getRoles(String UserId);

}

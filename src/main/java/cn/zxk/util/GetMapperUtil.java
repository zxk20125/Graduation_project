package cn.zxk.util;

import cn.zxk.entity.serveEntity.Role;
import cn.zxk.mappers.serveMapper.RoleMapper;
import cn.zxk.mappers.serveMapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @author Chickck
 * @date 2021/1/29
 */
@Component
public class GetMapperUtil {
    @Autowired
    private static UserMapper userMapper;

    @Autowired
    private static RoleMapper roleMapper;

    public static UserMapper getUserMapper() {
        return userMapper;
    }

    public static RoleMapper getRoleMapper() {
        return roleMapper;
    }

}

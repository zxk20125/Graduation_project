package cn.zxk.service.sysService.impl;

import cn.zxk.entity.serveEntity.UserRole;
import cn.zxk.mappers.serveMapper.UserRoleMapper;
import cn.zxk.service.sysService.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户和用户角色关联表 服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}

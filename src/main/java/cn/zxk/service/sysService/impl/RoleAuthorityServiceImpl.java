package cn.zxk.service.sysService.impl;

import cn.zxk.entity.serveEntity.RoleAuthority;
import cn.zxk.mappers.serveMapper.RoleAuthorityMapper;
import cn.zxk.service.sysService.IRoleAuthorityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色和用户权限关联表 服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Service
public class RoleAuthorityServiceImpl extends ServiceImpl<RoleAuthorityMapper, RoleAuthority> implements IRoleAuthorityService {

}

package cn.zxk.service.sysService.impl;

import cn.zxk.entity.serveEntity.RoleMenu;
import cn.zxk.mappers.serveMapper.RoleMenuMapper;
import cn.zxk.service.sysService.IRoleMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色和用户菜单关联表 服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements IRoleMenuService {

}

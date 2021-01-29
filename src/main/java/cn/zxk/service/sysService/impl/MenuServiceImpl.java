package cn.zxk.service.sysService.impl;

import cn.zxk.entity.serveEntity.Menu;
import cn.zxk.mappers.serveMapper.MenuMapper;
import cn.zxk.service.sysService.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户菜单表 服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}

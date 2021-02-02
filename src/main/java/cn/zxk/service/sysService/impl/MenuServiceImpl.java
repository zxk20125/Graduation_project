package cn.zxk.service.sysService.impl;

import cn.zxk.entity.serveEntity.Menu;
import cn.zxk.entity.serveEntity.Role;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.Range;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.mappers.serveMapper.MenuMapper;
import cn.zxk.service.sysService.IMenuService;
import cn.zxk.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public RespMessage query(QueryEntity<Menu> query) {
        QueryEntity.Order order = query.getOrders().get(0);
        Range range = query.getRanges().get(0);
        return RespMessage.ok("success", menuMapper.selectPage(new Page<>(query.getPageNum(), query.getPageSize()), new QueryWrapper<Menu>()
                .like(!StringUtil.isBlank(query.getQuery().getName()), "NAME", query.getQuery().getName())
                .orderBy(true, !order.getOrder().equals("desc"), "create_time")
        ));
    }
}

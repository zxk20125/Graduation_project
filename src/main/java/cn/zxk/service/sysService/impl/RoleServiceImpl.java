package cn.zxk.service.sysService.impl;

import cn.zxk.entity.serveEntity.Authority;
import cn.zxk.entity.serveEntity.Menu;
import cn.zxk.entity.serveEntity.Role;
import cn.zxk.entity.serveEntity.User;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.Range;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.mappers.serveMapper.RoleMapper;
import cn.zxk.mappers.serveMapper.UserMapper;
import cn.zxk.service.sysService.IRoleService;
import cn.zxk.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public RespMessage query(QueryEntity<Role> query) {
        QueryEntity.Order order = query.getOrders().get(0);
        Range range = query.getRanges().get(0);
        return RespMessage.ok("success", roleMapper.selectPage(new Page<>(query.getPageNum(), query.getPageSize()), new QueryWrapper<Role>()
                .like(!StringUtil.isBlank(query.getQuery().getName()), "NAME", query.getQuery().getName())
                .orderBy(true, !order.getOrder().equals("desc"), "create_time")
        ));
    }
}

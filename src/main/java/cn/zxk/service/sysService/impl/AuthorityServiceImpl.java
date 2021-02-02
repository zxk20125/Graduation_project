package cn.zxk.service.sysService.impl;

import cn.zxk.entity.serveEntity.Authority;
import cn.zxk.entity.serveEntity.Role;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.Range;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.mappers.serveMapper.AuthorityMapper;
import cn.zxk.service.sysService.IAuthorityService;
import cn.zxk.util.StringUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户权限表 服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Service
public class AuthorityServiceImpl extends ServiceImpl<AuthorityMapper, Authority> implements IAuthorityService {
    @Autowired
    private AuthorityMapper authorityMapper;
    @Override
    public RespMessage query(QueryEntity<Authority> query) {
        QueryEntity.Order order = query.getOrders().get(0);
        Range range = query.getRanges().get(0);
        return RespMessage.ok("success", authorityMapper.selectPage(new Page<>(query.getPageNum(), query.getPageSize()), new QueryWrapper<Authority>()
                .like(!StringUtil.isBlank(query.getQuery().getName()), "NAME", query.getQuery().getName())
                .orderBy(true, !order.getOrder().equals("desc"), "create_time")
        ));
    }
}

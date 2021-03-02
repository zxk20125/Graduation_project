package cn.zxk.service.appService.impl;

import cn.zxk.entity.appEntity.TOrder;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.mappers.appMapper.TOrderMapper;
import cn.zxk.service.appService.ITOrderService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-16
 */
@Service
public class TOrderServiceImpl extends ServiceImpl<TOrderMapper, TOrder> implements ITOrderService {

    @Override
    public Page<TOrder> selectPage(QueryEntity<TOrder> queryEntity) {
        return this.baseMapper.selectPage(new Page<>(queryEntity.getPageNum(),queryEntity.getPageSize()),null);
    }
}

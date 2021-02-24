package cn.zxk.service.appService.impl;

import cn.zxk.entity.appEntity.TShipAddress;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.mappers.appMapper.TShipAddressMapper;
import cn.zxk.service.appService.ITShipAddressService;
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
public class TShipAddressServiceImpl extends ServiceImpl<TShipAddressMapper, TShipAddress> implements ITShipAddressService {


    @Override
    public Page<TShipAddress> selectPage(QueryEntity<TShipAddress> query) {
        return this.getBaseMapper().selectPage(new Page<>(query.getPageNum(),query.getPageSize()),null);
    }
}

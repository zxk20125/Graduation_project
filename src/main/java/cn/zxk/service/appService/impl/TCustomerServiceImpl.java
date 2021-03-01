package cn.zxk.service.appService.impl;

import cn.zxk.entity.appEntity.TCustomer;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.mappers.appMapper.TCustomerMapper;
import cn.zxk.service.appService.ITCustomerService;
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
public class TCustomerServiceImpl extends ServiceImpl<TCustomerMapper, TCustomer> implements ITCustomerService {


    @Override
    public Page<TCustomer> selectQuery(QueryEntity<TCustomer> queryEntity) {
        TCustomer customer = queryEntity.getQuery();
        if (customer.getCustomerLoginName().equals("")||customer.getCustomerLoginName()==null)
            return this.getBaseMapper().selectPage(new Page<>(queryEntity.getPageNum(),queryEntity.getPageSize()),null);
        return this.getBaseMapper().selectPage(new Page<>(queryEntity.getPageNum(),queryEntity.getPageSize()),
                new QueryWrapper<TCustomer>().eq("customer_login_name",customer.getCustomerLoginName()));
    }
}

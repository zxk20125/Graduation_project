package cn.zxk.service.appService.impl;

import cn.zxk.entity.appEntity.TAddress;
import cn.zxk.entity.appEntity.TCustomer;
import cn.zxk.entity.appEntity.TStaff;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.mappers.appMapper.TAddressMapper;
import cn.zxk.service.appService.ITAddressService;
import cn.zxk.service.appService.ITCustomerService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-16
 */
@Service
public class TAddressServiceImpl extends ServiceImpl<TAddressMapper, TAddress> implements ITAddressService {
    @Autowired
    private ITCustomerService customerService;
    
    @Override
    public Page<TAddress> selectStaff(QueryEntity<TAddress> addressQueryEntity) {
        TAddress query = addressQueryEntity.getQuery();
        if (query.getLoginName()!=null&&!query.getLoginName().equals("")){
            Integer customerId=null;
            TCustomer customer = customerService.getOne(new QueryWrapper<TCustomer>().eq("customer_login_name", query.getLoginName()));
            if (customer!=null) customerId = customer.getCustomerId();
            return this.getBaseMapper().selectPage1(new Page<>(addressQueryEntity.getPageNum(), addressQueryEntity.getPageSize()),customerId);
        }
        return this.getBaseMapper().selectPage(new Page<>(addressQueryEntity.getPageNum(), addressQueryEntity.getPageSize()),null);
    }
}

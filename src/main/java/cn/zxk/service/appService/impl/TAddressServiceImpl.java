package cn.zxk.service.appService.impl;

import cn.zxk.entity.appEntity.TAddress;
import cn.zxk.entity.appEntity.TCustomer;
import cn.zxk.mappers.appMapper.TAddressMapper;
import cn.zxk.service.appService.ITAddressService;
import cn.zxk.service.appService.ITCustomerService;
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
    private TAddressMapper addressMapper;
    @Autowired
    private ITCustomerService customerService;
    
    @Override
    public List<TAddress> list() {
        List<TAddress> addresses = addressMapper.selectList(null);
        addresses.forEach(address->{
            address.setLogin_name(customerService.getById(address.getCustomerId()).getCustomerLoginName());
        });
        return addresses;
    }
}

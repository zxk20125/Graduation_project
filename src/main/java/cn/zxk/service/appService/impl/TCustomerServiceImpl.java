package cn.zxk.service.appService.impl;

import cn.zxk.entity.appEntity.TCustomer;
import cn.zxk.mappers.appMapper.TCustomerMapper;
import cn.zxk.service.appService.ITCustomerService;
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

}
package .test.service.impl;

import .test.entity.TCustomer;
import .test.mapper.TCustomerMapper;
import .test.service.ITCustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-05
 */
@Service
public class TCustomerServiceImpl extends ServiceImpl<TCustomerMapper, TCustomer> implements ITCustomerService {

}

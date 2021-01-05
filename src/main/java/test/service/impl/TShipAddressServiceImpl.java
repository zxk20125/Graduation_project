package .test.service.impl;

import .test.entity.TShipAddress;
import .test.mapper.TShipAddressMapper;
import .test.service.ITShipAddressService;
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
public class TShipAddressServiceImpl extends ServiceImpl<TShipAddressMapper, TShipAddress> implements ITShipAddressService {

}

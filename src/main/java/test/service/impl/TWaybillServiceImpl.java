package .test.service.impl;

import .test.entity.TWaybill;
import .test.mapper.TWaybillMapper;
import .test.service.ITWaybillService;
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
public class TWaybillServiceImpl extends ServiceImpl<TWaybillMapper, TWaybill> implements ITWaybillService {

}

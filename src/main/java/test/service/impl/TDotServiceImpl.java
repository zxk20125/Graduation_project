package .test.service.impl;

import .test.entity.TDot;
import .test.mapper.TDotMapper;
import .test.service.ITDotService;
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
public class TDotServiceImpl extends ServiceImpl<TDotMapper, TDot> implements ITDotService {

}

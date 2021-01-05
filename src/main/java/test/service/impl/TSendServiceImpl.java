package .test.service.impl;

import .test.entity.TSend;
import .test.mapper.TSendMapper;
import .test.service.ITSendService;
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
public class TSendServiceImpl extends ServiceImpl<TSendMapper, TSend> implements ITSendService {

}

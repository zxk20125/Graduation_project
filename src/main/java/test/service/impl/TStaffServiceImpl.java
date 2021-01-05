package .test.service.impl;

import .test.entity.TStaff;
import .test.mapper.TStaffMapper;
import .test.service.ITStaffService;
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
public class TStaffServiceImpl extends ServiceImpl<TStaffMapper, TStaff> implements ITStaffService {

}

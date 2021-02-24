package cn.zxk.service.appService.impl;

import cn.zxk.entity.appEntity.TStaff;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.mappers.appMapper.TStaffMapper;
import cn.zxk.service.appService.ITStaffService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-16
 */
@Service
public class TStaffServiceImpl extends ServiceImpl<TStaffMapper, TStaff> implements ITStaffService {

    @Override
    public Page<TStaff> selectStaff(QueryEntity<TStaff> staffQueryEntity) {
        QueryWrapper<TStaff> queryWrapper = new QueryWrapper<>();
        TStaff query = staffQueryEntity.getQuery();
        queryWrapper.like("staff_name",query.getStaffName());

        return this.getBaseMapper().selectPage(new Page<>(staffQueryEntity.getPageNum(),staffQueryEntity.getPageSize()),queryWrapper);
    }
}

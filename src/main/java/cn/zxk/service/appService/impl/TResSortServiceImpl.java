package cn.zxk.service.appService.impl;

import cn.zxk.entity.appEntity.TResSort;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.mappers.appMapper.TResSortMapper;
import cn.zxk.service.appService.ITResSortService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
public class TResSortServiceImpl extends ServiceImpl<TResSortMapper, TResSort> implements ITResSortService {

    @Override
    public Page<TResSort> selectPage(QueryEntity<TResSort> queryEntity) {
        return this.getBaseMapper().selectPage(new Page<TResSort>(queryEntity.getPageNum(),queryEntity.getPageSize()),null);
    }
}

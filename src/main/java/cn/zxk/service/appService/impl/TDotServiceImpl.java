package cn.zxk.service.appService.impl;

import cn.zxk.entity.appEntity.TDot;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.mappers.appMapper.TDotMapper;
import cn.zxk.service.appService.ITDotService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
public class TDotServiceImpl extends ServiceImpl<TDotMapper, TDot> implements ITDotService {

    @Override
    public Page<TDot> selectPage(QueryEntity<TDot> queryEntity) {
        String name= queryEntity.getQuery().getDotName();
        if(null!=name&&!"".equals(name))
            return this.getBaseMapper().selectPage(new Page<TDot>(queryEntity.getPageNum(),queryEntity.getPageSize()),
                    new QueryWrapper<TDot>().eq("dot_name",name));
        return this.getBaseMapper().selectPage(new Page<TDot>(queryEntity.getPageNum(),queryEntity.getPageSize()),null);
    }
}

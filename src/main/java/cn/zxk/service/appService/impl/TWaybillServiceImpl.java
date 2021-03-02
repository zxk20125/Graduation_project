package cn.zxk.service.appService.impl;

import cn.zxk.entity.appEntity.TWaybill;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.mappers.appMapper.TWaybillMapper;
import cn.zxk.service.appService.ITWaybillService;
import cn.zxk.util.StringUtil;
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
public class TWaybillServiceImpl extends ServiceImpl<TWaybillMapper, TWaybill> implements ITWaybillService {

    @Override
    public Page<TWaybill> selectPage(QueryEntity<TWaybill> queryEntity) {
        TWaybill query = queryEntity.getQuery();
        return this.baseMapper.selectPage(new Page<>(queryEntity.getPageNum(),queryEntity.getPageSize())
                ,new QueryWrapper<TWaybill>().eq(!StringUtil.isBlank(query.getWaybillId()),"waybill_id",query.getWaybillId()));
    }
}

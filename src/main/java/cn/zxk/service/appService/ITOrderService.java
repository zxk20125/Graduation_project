package cn.zxk.service.appService;

import cn.zxk.entity.appEntity.TOrder;
import cn.zxk.entity.utilEntity.QueryEntity;
import com.baomidou.mybatisplus.core.injector.methods.SelectPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Chick
 * @since 2021-01-16
 */
public interface ITOrderService extends IService<TOrder> {
    
    Page<TOrder> selectPage(QueryEntity<TOrder> queryEntity);

    TOrder selectById(String id);
}

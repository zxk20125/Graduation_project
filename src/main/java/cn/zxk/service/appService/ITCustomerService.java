package cn.zxk.service.appService;

import cn.zxk.entity.appEntity.TCustomer;
import cn.zxk.entity.utilEntity.QueryEntity;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.omg.CORBA.TCKind;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Chick
 * @since 2021-01-16
 */
public interface ITCustomerService extends IService<TCustomer> {

    Page<TCustomer> selectQuery(QueryEntity<TCustomer> queryEntity);
}

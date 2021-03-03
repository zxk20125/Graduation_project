package cn.zxk.service.appService;

import cn.zxk.entity.appEntity.TStaff;
import cn.zxk.entity.utilEntity.QueryEntity;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Chick
 * @since 2021-01-16
 */
public interface ITStaffService extends IService<TStaff> {

    Page<TStaff> selectStaff(QueryEntity<TStaff> staffQueryEntity);

}

package cn.zxk.service.sysService;


import cn.zxk.entity.serveEntity.User;
import cn.zxk.entity.utilEntity.QueryEntity;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
public interface IUserService extends IService<User> {

    Page<User> selectPage(QueryEntity<User>queryEntity);
}

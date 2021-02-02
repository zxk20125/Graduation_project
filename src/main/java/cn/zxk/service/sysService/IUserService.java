package cn.zxk.service.sysService;


import cn.zxk.entity.serveEntity.User;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
public interface IUserService extends IService<User> {

    RespMessage query(QueryEntity<User>queryEntity);
}

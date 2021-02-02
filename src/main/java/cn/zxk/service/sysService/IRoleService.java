package cn.zxk.service.sysService;


import cn.zxk.entity.serveEntity.Role;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.RespMessage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户角色表 服务类
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
public interface IRoleService extends IService<Role> {
    RespMessage query(QueryEntity<Role> queryEntity);
}

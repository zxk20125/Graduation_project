package cn.zxk.service;

import cn.zxk.entity.TStaff;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Chick
 * @since 2021-01-16
 */
public interface ITStaffService extends IService<TStaff> {
    String login(String username,String password);

}

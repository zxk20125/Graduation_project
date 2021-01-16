package cn.zxk.service.impl;

import cn.zxk.entity.TStaff;
import cn.zxk.mappers.TStaffMapper;
import cn.zxk.service.ITStaffService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.org.apache.bcel.internal.generic.RET;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-16
 */
@Service
public class TStaffServiceImpl extends ServiceImpl<TStaffMapper, TStaff> implements ITStaffService {

    @Autowired
    private TStaffMapper TStaffMapper;

    public String login(String username, String password) {
        QueryWrapper<TStaff> stafflogin = new QueryWrapper<>();
        stafflogin
                .eq("staff_login_name", username)
                .select("staff_password");
        TStaff tStaff = TStaffMapper.selectOne(stafflogin);
        if(null==tStaff) return "wrong_username";
        System.out.println(password+"  "+tStaff.getStaffPassword());
        if(password.equals(tStaff.getStaffPassword())) return "success";
        else return "wrong_password";
    }

}

package cn.zxk.service.impl;

import cn.zxk.entity.TStaff;
import cn.zxk.mappers.TStaffMapper;
import cn.zxk.service.ITStaffService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.org.apache.bcel.internal.generic.RET;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class TStaffServiceImpl extends ServiceImpl<TStaffMapper, TStaff> implements ITStaffService, UserDetailsService {

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

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        QueryWrapper<TStaff> wrapper = new QueryWrapper<>();
        wrapper
                .eq("staff_login_name", s);
        TStaff tStaff = TStaffMapper.selectOne(wrapper);
        System.out.println(111111);
        if(null==tStaff) throw  new UsernameNotFoundException("无账号");
        else return new User(tStaff.getStaffLoginName(),tStaff.getStaffPassword(),getGrantedAuthority(tStaff.getStaffRole()));
    }
    public List<GrantedAuthority> getGrantedAuthority(String role){
        List<GrantedAuthority> list=new ArrayList<>();
        list.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return list;
    }

}

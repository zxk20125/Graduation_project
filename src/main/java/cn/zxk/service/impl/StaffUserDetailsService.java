package cn.zxk.service.impl;

import cn.zxk.entity.TStaff;
import cn.zxk.util.crypto.DES3Util;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.SneakyThrows;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 功能描述：
 *
 * @author Chickck
 * @date 2021/1/20
 */
@Service
@MapperScan("cn.zxk.mapper.*")
public class StaffUserDetailsService implements UserDetailsService {
    @Autowired
    private TStaffServiceImpl staffService;
    //处理不想处理的异常
    @SneakyThrows
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        //从数据库取出用户信息
        QueryWrapper<TStaff> staffQueryWrapper=new QueryWrapper<>();
        staffQueryWrapper.eq("staff_login_name",username);
        TStaff staff = staffService.getOne(staffQueryWrapper);
        System.out.println(staff.getStaffRole());
        if(null!=staff)
            //获取用户角色，添加权限
            authorities.add(new SimpleGrantedAuthority(staff.getStaffRole()));
        else
            throw new UsernameNotFoundException("用户名不存在");
        return new User(staff.getStaffLoginName(), staff.getStaffPassword(), authorities);
    }
}

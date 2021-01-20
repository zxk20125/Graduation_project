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
 * ����������
 *
 * @author Chickck
 * @date 2021/1/20
 */
@Service
@MapperScan("cn.zxk.mapper.*")
public class StaffUserDetailsService implements UserDetailsService {
    @Autowired
    private TStaffServiceImpl staffService;
    //�����봦����쳣
    @SneakyThrows
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        //�����ݿ�ȡ���û���Ϣ
        QueryWrapper<TStaff> staffQueryWrapper=new QueryWrapper<>();
        staffQueryWrapper.eq("staff_login_name",username);
        TStaff staff = staffService.getOne(staffQueryWrapper);
        System.out.println(staff.getStaffRole());
        if(null!=staff)
            //��ȡ�û���ɫ�����Ȩ��
            authorities.add(new SimpleGrantedAuthority(staff.getStaffRole()));
        else
            throw new UsernameNotFoundException("�û���������");
        return new User(staff.getStaffLoginName(), staff.getStaffPassword(), authorities);
    }
}

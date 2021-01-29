package cn.zxk;

import cn.zxk.entity.appEntity.TStaff;
import cn.zxk.entity.serveEntity.Authority;
import cn.zxk.entity.serveEntity.Role;
import cn.zxk.entity.serveEntity.User;
import cn.zxk.mappers.serveMapper.RoleMapper;
import cn.zxk.mappers.serveMapper.UserMapper;
import cn.zxk.service.DefaultUserDetails;
import cn.zxk.service.appService.ITStaffService;
import cn.zxk.service.sysService.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.plugin2.message.GetAppletMessage;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private ITStaffService staffService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private IUserService userService;

    @Test
    public void getList() {
        List<TStaff> list = staffService.list();
        System.out.println(list);
    }

    @Test
    public void getUserdetail() {
        User user = userService.getOne(new QueryWrapper<User>().eq("NAME", "admin"));
        System.out.println(user.getID());
        List<Role> roles = userMapper.getRoles(user.getID());
//        roles.forEach(role -> {
//            List<Authority> authority = roleMapper.getAuthority(role.getID());
//            System.out.println(authority);
//        });
    }
}

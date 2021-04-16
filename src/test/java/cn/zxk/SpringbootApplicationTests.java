package cn.zxk;

import cn.zxk.entity.appEntity.TStaff;
import cn.zxk.entity.serveEntity.Authority;
import cn.zxk.entity.serveEntity.Role;
import cn.zxk.entity.serveEntity.User;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.mappers.serveMapper.RoleMapper;
import cn.zxk.mappers.serveMapper.UserMapper;
import cn.zxk.service.DefaultUserDetails;
import cn.zxk.service.appService.ITStaffService;
import cn.zxk.service.sysService.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sound.midi.Soundbank;
import javax.xml.ws.WebServiceRefs;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
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
    public void query(){
    }
}

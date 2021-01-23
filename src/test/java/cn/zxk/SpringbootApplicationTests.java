package cn.zxk;

import cn.zxk.entity.TStaff;
import cn.zxk.service.ITStaffService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootApplicationTests {
   @Autowired
    private ITStaffService staffService;
   @Test
    public void getList(){
       List<TStaff> list = staffService.list();
       System.out.println(list);
   }
}

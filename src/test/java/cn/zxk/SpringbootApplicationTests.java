package cn.zxk;

import cn.zxk.entity.Student;
import cn.zxk.mappers.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private StudentMapper studentMapper;
    @Test
    void contextLoads() {
        List<Student> students = studentMapper.selectList(null);
        students.forEach(System.out::println);
    }
    @Test
    void insert(){
        Student student=new Student();
        student.setUsername("zhangsan");
        student.setPassword("1234");
        student.setNum(1);
        student.setChinese("100");
        student.setEnglish("99");
        int insert = studentMapper.insert(student);
        System.out.println(insert);
    }
}

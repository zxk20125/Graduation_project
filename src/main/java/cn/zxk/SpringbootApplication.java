package cn.zxk;
import cn.zxk.service.ITStaffService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ServletComponentScan
/*
使用@ServletComponentScan 注解后
Servlet可以直接通过@WebServlet注解自动注册
Filter可以直接通过@WebFilter注解自动注册
Listener可以直接通过@WebListener 注解自动注册
*/
@MapperScan("cn.zxk.mappers")
public class SpringbootApplication implements CommandLineRunner {

    @Autowired
    private ITStaffService staffService;
   
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //spring ioc启动完之后会回调该方法
        System.out.println("spring启动完成。。。");
    }
}

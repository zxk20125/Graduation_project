package cn.zxk.config;

import cn.zxk.service.impl.StaffUserDetailsService;
import cn.zxk.util.crypto.DES3Util;
import com.sun.org.apache.xpath.internal.operations.And;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;


/**
 * ����������
 *
 * @author Chickck
 * @date 2021/1/20
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private StaffUserDetailsService staffUserDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(staffUserDetailsService).passwordEncoder(new PasswordEncoder() {
            @Override
            @SneakyThrows
            public String encode(CharSequence charSequence) {
                return DES3Util.encode(charSequence.toString());
            }

            @Override
            @SneakyThrows
            public boolean matches(CharSequence charSequence, String s) {
                return charSequence.equals(DES3Util.encode(s));
            }
        });
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // ���������������url����������
                .antMatchers("/verify/jpgCode").permitAll()
                .anyRequest().authenticated()
                .and()
                // ���õ�½ҳ
                .formLogin().loginPage("/login")
                // ���õ�½�ɹ�ҳ
                .defaultSuccessUrl("/WMS/login").permitAll()
                // �Զ����½�û��������������Ĭ��Ϊusername��password
//                .usernameParameter("username")
//                .passwordParameter("password")
                .and()
                .logout().permitAll();


        // �ر�CSRF����
        http.csrf().disable();
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        // �������غ����ļ��У����ԶԾ�̬��Դ����
        web.ignoring().antMatchers("/css/**", "/js/**");
    }
}
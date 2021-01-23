package cn.zxk.config.security;

import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 登陆成功返回数据
 *
 * @author Chickck
 * @date 2021/1/21
 */
@Component("AuthenticationSuccessHandler")
public class AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        Map<String,Object> login_data =new HashMap<>();
        Map<String,Object> obj =new HashMap<>();
        JsonMapper mapper=new JsonMapper();
        login_data.put("msg","登陆成功");
        login_data.put("success",true);
        login_data.put("status",200);
        obj.put("token","admin");
        login_data.put("obj",obj);
        String value = mapper.writeValueAsString(login_data);
        response.getWriter().append(value);
    }
}

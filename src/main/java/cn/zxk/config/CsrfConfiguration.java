package cn.zxk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

@Configuration
public class CsrfConfiguration {

  @Bean
  CsrfTokenRepository csrfTokenRepository() {
    return new HttpSessionCsrfTokenRepository();
  }

}

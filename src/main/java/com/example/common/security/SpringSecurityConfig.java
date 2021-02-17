package com.example.common.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("root").password(new BCryptPasswordEncoder().encode("123456")).roles("admin");
    }

    /**
     * 可以配置一些静态资源过滤
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/**/css/**", "/**/js/**", "/**/lib/**", "/**/api/**", "/**/images/**", "/**/api/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("/login").permitAll() // 跳转到指定的登录页，并授权所有用户可以访问
                .loginProcessingUrl("/user/login") // 指定登录的url
//                .successForwardUrl("/test") // 登录成功后跳转页面
                .and()
                .authorizeRequests() // 开启授权请求
                .anyRequest().authenticated() // 拦截所有请求
                .and().csrf().disable(); // 关闭csrf
    }
}

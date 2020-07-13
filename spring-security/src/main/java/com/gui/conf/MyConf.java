package com.gui.conf;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class MyConf extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/h1/**").hasRole("vip1")
                .antMatchers("/h2/**").hasRole("vip2");
        http.formLogin().loginPage("/login").usernameParameter("name").passwordParameter("password").loginProcessingUrl("/toLogin");//登录
        http.logout().logoutSuccessUrl("/"); //默认"/logout"注销
        http.csrf().disable(); //关闭跨域保护
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("root").password(new BCryptPasswordEncoder().encode("123")).roles("vip2","vip1")
                .and()
                .withUser("agency").password(new BCryptPasswordEncoder().encode("123")).roles("vip2");
    }
}

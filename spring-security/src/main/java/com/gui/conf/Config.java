package com.gui.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/h1").setViewName("h1");
        registry.addViewController("/h2").setViewName("h2");
        registry.addViewController("/toLogin").setViewName("login");
    }
}

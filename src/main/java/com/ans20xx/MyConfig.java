package com.ans20xx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration         // 1
@EnableWebMvc          // 1
@ComponentScan("com.ans20xx")   // 1
public class MyConfig {

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();  // 2
        internalResourceViewResolver.setPrefix("/WEB-INF/classes/views/");   // 3
        internalResourceViewResolver.setSuffix(".jsp");                      // 3
        internalResourceViewResolver.setViewClass(JstlView.class);           // 4
        return internalResourceViewResolver;                                 // 5
    }
}

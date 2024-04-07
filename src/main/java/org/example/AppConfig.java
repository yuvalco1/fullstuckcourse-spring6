package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class AppConfig {

    @Bean
    public ViewResolver getViewResolver() {
        return new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
    }
}

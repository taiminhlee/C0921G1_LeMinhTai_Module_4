package vn.codegym.case_study.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;


@Configuration
public class AppConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource msg= new ResourceBundleMessageSource();
        msg.setBasename("errorMsg");
        msg.setDefaultEncoding("UTF-8");
        return msg;
    }
}

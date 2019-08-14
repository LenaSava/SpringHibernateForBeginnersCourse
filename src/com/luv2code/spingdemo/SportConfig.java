package com.luv2code.spingdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.spingdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    //define bean
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //bean swim coach
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

    //dependency for swim inject dep
}

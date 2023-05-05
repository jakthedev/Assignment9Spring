package com.coderscampus.demo.config;

import com.coderscampus.demo.domain.Recipe;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

@Bean
    public Recipe recipe(){
    return new Recipe(11, true, true, "do this do that",
            22.0, 5.0, 30, 5,
            20.0, "Good Stuff", true, false);
}
}

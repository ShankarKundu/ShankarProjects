package com.example.springrestimpl.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebConfig {
    public WebConfig() {
        System.out.println("Web confog()");
    }
}

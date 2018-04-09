package com.revature.hydraaggregatorservice.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class CorsConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

        config.getCorsRegistry().addMapping("/**")
            .allowedOrigins("*")
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
            .allowedHeaders("Content-Type", "Authorization", "Access-Control-Allow-Origin")
            .exposedHeaders("Content-Type", "Authorization", "Access-Control-Allow-Origin")
            .allowCredentials(false).maxAge(3600);
    }

}

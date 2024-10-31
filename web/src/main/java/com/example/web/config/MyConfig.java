// MyConfig.java
package com.example.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.glassfish.jersey.server.ResourceConfig;
import com.example.web.rest.CompteRestJaxRSAPI; // Ensure this class exists in this package

@Configuration
public class MyConfig {

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRSAPI.class); // Register your REST resource here
        return jerseyServlet;
    }
}

package com.example.service;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {
    @Bean
    public ServletRegistrationBean<CXFServlet> cxfServletRegistration() {
        return new ServletRegistrationBean<>(new CXFServlet(), "/services/*");
    }
}


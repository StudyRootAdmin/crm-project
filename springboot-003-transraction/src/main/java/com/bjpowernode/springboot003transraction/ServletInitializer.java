package com.bjpowernode.springboot003transraction;

import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Springboot003TransactionApplication.class);
    }

}

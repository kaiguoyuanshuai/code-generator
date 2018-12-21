package com.zcoco.code.codegenerator;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
public class CodeGeneratorApplication {

    @Autowired
    private VelocityEngine velocityEngine;

    public static void main(String[] args) {
        SpringApplication.run(CodeGeneratorApplication.class, args);
    }

/*
    @Bean
    VelocityEngine velocityEngine() throws IOException {
        Properties properties = new Properties();
        properties.load(this.getClass().getResourceAsStream("/application.properties"));
        properties.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        properties.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName()) ;
        return new VelocityEngine(properties);
    }*/

}


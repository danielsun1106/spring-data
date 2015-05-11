package com.nixmash.springdata.jpa.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created with IntelliJ IDEA.
 * User: daveburke
 * Date: 5/7/15
 * Time: 4:20 PM
 */
@Configuration
@EnableConfigurationProperties
@EnableTransactionManagement
@ComponentScan(basePackages = "com.nixmash.springdata.jpa")
@EnableJpaRepositories(basePackages = "com.nixmash.springdata.jpa")
public class ApplicationConfig {

}
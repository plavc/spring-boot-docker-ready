package com.plavcak.demo.sbdockerready.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Calculator.class)
public class CoreConfig {

}

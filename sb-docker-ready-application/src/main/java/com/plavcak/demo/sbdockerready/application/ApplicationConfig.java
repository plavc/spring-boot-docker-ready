package com.plavcak.demo.sbdockerready.application;

import com.plavcak.demo.sbdockerready.core.CoreConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CoreConfig.class})
public class ApplicationConfig {

}

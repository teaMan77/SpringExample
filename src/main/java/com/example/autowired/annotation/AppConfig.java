package com.example.autowired.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //Spring container will look for this class instead of xml file because of this annotation.
@ComponentScan("com.example.autowired.annotation")
public class AppConfig {
}

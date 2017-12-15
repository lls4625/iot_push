package com.lxr.iot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.run;

/**
 * 启动类
 *
 * @author lxr
 * @create 2017-11-18 13:54
 **/
@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = run(ServerApplication.class, args);
    }
}

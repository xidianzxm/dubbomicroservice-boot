package com.test.dubbo;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
1、引入dubbo的starter
2、dubbo的相关场景配好了吗？
    1）以前配置的再配一下
    2）服务提供者使用@Service暴露服务
    3) 服务消费者使用@Reference引用服务
3、开启Dubbo基于注解的功能
 */

//@DubboComponentScan
@EnableDubbo
@SpringBootApplication
public class DubboMovieProviderBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboMovieProviderBootApplication.class, args);
    }
}

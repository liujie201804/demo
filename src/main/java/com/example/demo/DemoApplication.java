package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author jieliu
 * 访问地址：http://localhost:8888/swagger-ui/index.html
 */
@EnableOpenApi
@SpringBootApplication
@MapperScan("com.example.demo.mybatisPlus.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

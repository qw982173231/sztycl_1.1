package com.szt.sztycl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.szt.sztycl.mapper")
@SpringBootApplication
public class SztyclApplication {

    public static void main(String[] args) {
        SpringApplication.run(SztyclApplication.class, args);
    }

}

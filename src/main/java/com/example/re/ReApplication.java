package com.example.re;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication()
@ServletComponentScan
@EnableTransactionManagement
public class ReApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReApplication.class, args);
        log.info("ok");
    }
}

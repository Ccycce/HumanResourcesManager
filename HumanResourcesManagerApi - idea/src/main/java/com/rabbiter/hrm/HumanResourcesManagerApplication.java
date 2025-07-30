package com.rabbiter.hrm;

import com.rabbiter.hrm.util.PathUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@MapperScan("com.rabbiter.hrm.mapper")
@SpringBootApplication
@EnableTransactionManagement // 事务
public class HumanResourcesManagerApplication {
    public static void main(String[] args) {
        System.out.println("Project Path : " + PathUtils.getClassLoadRootPath());
        SpringApplication.run(HumanResourcesManagerApplication.class, args);
    }
}

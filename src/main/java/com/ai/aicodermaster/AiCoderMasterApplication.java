package com.ai.aicodermaster;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ai.aicodermaster.mapper")
@SpringBootApplication
public class AiCoderMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiCoderMasterApplication.class, args);
    }

}

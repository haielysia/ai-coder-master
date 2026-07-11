package com.ai.aicodermaster;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan("com.ai.aicodermaster.mapper")
@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@EnableCaching
public class AiCoderMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiCoderMasterApplication.class, args);
    }

}

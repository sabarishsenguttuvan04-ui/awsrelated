package com.springboot.aws_springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig {

    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);         // Minimum threads active
        executor.setMaxPoolSize(10);         // Maximum threads
        executor.setQueueCapacity(25);       // Tasks waiting in the queue
        executor.setThreadNamePrefix("AsyncThread-"); // Prefix for thread names (helpful for debugging)
        executor.initialize();
        return executor;
    }
}


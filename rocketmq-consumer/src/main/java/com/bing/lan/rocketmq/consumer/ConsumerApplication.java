package com.bing.lan.rocketmq.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ConsumerApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext application = SpringApplication.run(ConsumerApplication.class, args);
    Environment env = application.getEnvironment();
    log.info("\n----------------------------------------------------------\n\t" +
            "应用 '{}' 运行成功! \n" +
            "----------------------------------------------------------",
        env.getProperty("spring.application.name"));
  }
}

package com.want.version.demo.consumer;

import com.want.version.demo.consumer.service.DemoApiConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;

/**
 * @author WangZhiJian
 * @since 2021/7/28
 */
@Slf4j
@EnableScheduling
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }

    @Resource
    private DemoApiConsumerService demoApiConsumerService;

    @Scheduled(fixedDelay = 1000L)
    public void scheduler(){
        log.info(demoApiConsumerService.echo());
        log.info(demoApiConsumerService.curTime());
//        log.info("-----------------------------------------");
//        log.info(demoApiConsumerService.echo2());
//        log.info(demoApiConsumerService.curTime2().toString());
        log.info("*****************************************");
    }
}

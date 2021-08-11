package com.want.versions.consumer;

import com.want.version.demo.api.DemoApi;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author WangZhiJian
 * @since 2021/7/28
 */
@Slf4j
@EnableScheduling
@SpringBootApplication
public class VConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(VConsumerApplication.class, args);
    }

    @DubboReference
    private DemoApi demoApi;

    @DubboReference(version = "1970.0.0")
    private DemoApi demoApi2;

    @Scheduled(fixedDelay = 1000)
    public void scheduler(){
        log.info(demoApi.echo("hello"));
        log.info(demoApi.curTime());
        log.info("-----------------------------------------");
//        log.info(demoApi2.echo("9999"));
//        log.info(demoApi2.curTime());
//        log.info("*****************************************");
    }
}

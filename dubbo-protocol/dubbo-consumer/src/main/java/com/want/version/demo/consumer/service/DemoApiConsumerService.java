package com.want.version.demo.consumer.service;

import com.want.version.demo.api.DemoApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author WangZhiJian
 * @since 2021/7/28
 */
@Service
public class DemoApiConsumerService {
    @DubboReference//(protocol = "http")
    private DemoApi demoApi;

//    @DubboReference(version = "2.0.0")
//    private DemoApi demoApi2;

//    @DubboReference(protocol = "kryo")
//    private DemoApi demoApi2;

    public String echo(){
        return demoApi.echo(LocalDateTime.now().toLocalTime().toString());
    }

    public String curTime(){
        return demoApi.curTime();
    }

//    public String echo2(){
//        return demoApi2.echo(LocalDateTime.now().toLocalTime().toString());
//    }
//
//    public String curTime2(){
//        return demoApi2.curTime();
//    }
}

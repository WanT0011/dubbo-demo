package com.want.demo.provider.api;

import com.want.version.demo.api.DemoApi;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;

/**
 * @author WangZhiJian
 * @since 2021/7/29
 */
@DubboService(protocol = "kryo")
public class DemoApiKryo implements DemoApi {
    @Override
    public String echo(String s) {
        return "kryo";
    }

    @Override
    public String curTime() {
        return LocalDateTime.now().toString() + " --- kryo";
    }
}

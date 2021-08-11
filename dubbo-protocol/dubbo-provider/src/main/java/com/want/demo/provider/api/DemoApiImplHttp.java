package com.want.demo.provider.api;

import com.want.version.demo.api.DemoApi;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;

/**
 * @author WangZhiJian
 * @since 2021/7/27
 */
@DubboService()
public class DemoApiImplHttp implements DemoApi {

    @Override
    public String echo(String s) {
        return s;
    }

    @Override
    public String curTime() {
        return LocalDateTime.now().toString();
    }
}

package com.want.versions.provider.api;

import com.want.version.demo.api.DemoApi;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;

/**
 * @author WangZhiJian
 * @since 2021/7/28
 */
@DubboService(weight = 2)
public class DemoApiFirst implements DemoApi {
    @Override
    public String echo(String s) {
        return s + "--------kyro";
    }

    @Override
    public String curTime() {
        return LocalDateTime.now().toString()+ "--------kyro";
    }
}

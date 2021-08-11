package com.want.versions.provider.api;

import com.want.version.demo.api.DemoApi;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDateTime;

/**
 * @author WangZhiJian
 * @since 2021/7/28
 */
@DubboService(version = "1970.0.0")
public class DemoApiSecond implements DemoApi {
    @Override
    public String echo(String s) {
        return "1970-- " + s + "--1970";
    }

    @Override
    public String curTime() {
        return LocalDateTime.now().minusYears(1970).toString();
    }
}

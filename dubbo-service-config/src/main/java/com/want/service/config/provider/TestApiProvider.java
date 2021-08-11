package com.want.service.config.provider;

/**
 * @author WangZhiJian
 * @since 2021/7/31
 */
public class TestApiProvider {

    public static void main(String[] args) {
//        ProtocolConfig protocol = ExtensionLoader.getExtensionLoader(ProtocolConfig.class).getExtension("dubbo");
//
//
//        ServiceConfig<DemoApi> service = new ServiceConfig<>();
//
//        service.setApplication("coustom-app");
//// 使用指定的协议暴露服务
//        service.setProtocol(protocol);
//        RegistryConfig registryConfig = new RegistryConfig("http://localhost:8848");
//// 注册中心，推荐alibaba最新的nacos
//        service.setRegistry(registryConfig);
//// 服务版本
//        service.setVersion("1.0");
//// 服务分组
//        service.setGroup("1.0");
//// 服务接口名
//        service.setInterface(DemoService.class);
//// 服务对象实现引用
//        service.setRef(new DemoServiceImpl());
//// 远程服务调用超时时间(毫秒)
//        service.setTimeout(10*1000);
//// 远程服务调用重试次数，不包括第一次调用（<=0时强制设置为1），不需要重试请设为0
//        service.setRetries(3);
//// 对每个提供者的最大连接数,dubbo等长连接协表示建立的长连接个数
//        service.setConnections(100);
//// 负载均衡策略，可选值：random,roundrobin,leastactive，分别表示：随机，轮询，最少活跃调用
//        service.setLoadbalance("leastactive");
//// 令牌验证，为空表示不开启，如果为true，表示随机生成动态令牌，否则使用静态令牌，令牌的作用是防止消费者绕过注册中心直接访问，保证注册中心的授权功能有效，如果使用点对点调用，需关闭令牌功能
//        service.setToken(true);
//// 设为true，将向logger中输出访问日志，也可填写访问日志文件路径，直接把访问日志输出到指定文件
//        service.setAccesslog(true);
//// 服务负责人
//        service.setOwner("345000890@qq.com");
    }
}

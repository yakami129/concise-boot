package com.github.yakami.user;

import com.github.yakami.library.infrastructure.common.base.BaseApplication;
import com.github.yakami.library.infrastructure.common.env.LoadLocalEnvConfigFactory;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDubbo
@EnableDiscoveryClient
public class UserApplication extends BaseApplication {

    public static void main(String[] args) {
        LoadLocalEnvConfigFactory.loadLocalEnv();
        SpringApplication.run(UserApplication.class, args);
    }

}

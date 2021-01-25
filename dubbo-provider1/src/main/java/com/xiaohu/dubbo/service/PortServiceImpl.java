package com.xiaohu.dubbo.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author ChenHu
 * @Date 2021/1/25 - 22:47
 * @Describe
 **/
@DubboService
public class PortServiceImpl implements PortService {

    @Value("${server.port}")
    String port;

    @Override
    public String getPort() {
        return port;
    }
}

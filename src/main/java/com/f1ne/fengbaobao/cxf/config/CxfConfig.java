package com.f1ne.fengbaobao.cxf.config;

import com.f1ne.fengbaobao.cxf.facade.UserService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @program: com.f1ne.fengbaobao.cxf.config
 * @description:
 * @author: qiyunfei
 * @create: 2018-2018-12 16:15
 **/
@Configuration
public class CxfConfig {
    @Autowired
    private Bus bus;

    @Autowired
    private UserService userService;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, userService);
        endpoint.publish("/userService");//接口发布在 /userService 目录下
        return endpoint;
    }
}

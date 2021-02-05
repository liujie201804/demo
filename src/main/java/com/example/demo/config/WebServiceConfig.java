package com.example.demo.config;

import com.example.demo.mybatisPlus.service.MyService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

/**
 * @description: webservice配置
 * @author: liujie
 * @title: WebServiceConfig
 * @date: 2021/1/8 16:35
 */
@Configuration
public class WebServiceConfig {

    @Resource
    private MyService myService;

    //* 此方法被注释后:wsdl访问地址为http://127.0.0.1:8080/services/user?wsdl
    //     * 去掉注释后：wsdl访问地址为：http://127.0.0.1:8080/webservice/user?wsdl
    @Bean(name = "cxfServlet")
    public ServletRegistrationBean cxfServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/webservice/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean(name = "webServiceDemoEndPoint")
    public Endpoint webServiceDemoEndPoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), myService);
        endpoint.publish("/webservice");
        return endpoint;
    }
}

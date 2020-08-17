package cn.link.server;

import cn.link.service.impl.HelloServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * 服务端，发布 webservice 服务
 *
 * 基于 ApacheCXF 实现的 WebService 框架
 *
 * @author Link
 * @version 1.0
 * @date 2020/8/11 22:39
 */
public class Server {

    public static void main(String[] args) {

        //发布服务的工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();

        //设置服务地址，后续直接通过 : 地址 + ?wsdl 的方式查看描述信息
        factory.setAddress("http://localhost:8000/webservice/hello");

        //设置服务类
        factory.setServiceBean(new HelloServiceImpl());

        //添加日志输入、输出拦截器，观察 soap 请求、soap 响应内容
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        //发布服务
        factory.create();

        System.out.println("success~");


    }

}

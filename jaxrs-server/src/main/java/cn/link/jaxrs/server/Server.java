package cn.link.jaxrs.server;

import cn.link.jaxrs.service.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * 发布服务
 *
 * @author Link
 * @version 1.0
 * @date 2020/8/17 22:15
 */
public class Server {

    public static void main(String[] args) {

        //发布服务的工厂
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

        //设置服务地址
        factory.setAddress("http://localhost:8001/webservice");

        //设置服务类
        factory.setServiceClass(UserServiceImpl.class);

        //添加日志输入、输出拦截器，观察 soap 请求、soap 响应内容
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        //发布服务
        factory.create();

        System.out.println("success~");

    }

}

package cn.link.client;

import cn.link.api.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * WebService 客户端
 *
 * 基于 ApacheCXF 实现的 WebService 框架
 *
 * @author Link
 * @version 1.0
 * @date 2020/8/11 23:55
 */
public class Client {

    public static void main(String[] args) {

        //服务接口访问地址 http://localhost:8000/webservice/hello
        //创建 cxf 代理工厂
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        //设置远程访问服务端地址
        factory.setAddress("http://localhost:8000/webservice/hello");

        //设置接口类型
        factory.setServiceClass(HelloService.class);

        //对接口生成代理对象
        HelloService helloService = factory.create(HelloService.class);

        //代理对象类型 class com.sun.proxy.$Proxy34 (jdk代理)
        System.out.println(helloService.getClass());

        //远程访问服务端方法
        System.out.println(helloService.hello("Hello WebService"));

        System.out.println("success~");

    }

}

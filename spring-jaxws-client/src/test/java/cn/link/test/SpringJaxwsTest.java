package cn.link.test;

import cn.link.api.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring整合CXF客户端测试
 *
 * @author Link
 * @version 1.0
 * @date 2020/8/17 21:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-webservice.xml")
public class SpringJaxwsTest {

    @Resource
    HelloService helloService;

    @Test
    public void remote() {

        //查看代理对象类型  class com.sun.proxy.$Proxy45  (JDK代理)
        System.out.println("class:" + helloService.getClass());

        //远程访问服务端接口
        System.out.println(helloService.hello("Hello, Spring-WebService!"));

    }

}

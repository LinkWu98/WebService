package cn.link.service.impl;

import cn.link.api.HelloService;

/**
 * @author Link
 * @version 1.0
 * @date 2020/8/11 22:25
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String hello) {

        //客户端来访问了
        System.out.println(hello);

        return hello;

    }

}

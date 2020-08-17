package cn.link.jaxrs.client;

import cn.link.api.rest.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

/**
 * 客户端调用服务
 *
 * @author Link
 * @version 1.0
 * @date 2020/8/17 22:21
 */
public class Client {

    @Test
    public void doPost(){

        //通过 WebClient.create 远程调用服务，服务路径 + 服务映射地址 + 方法映射地址
        WebClient
                .create("http://localhost:8001/webservice/userService/user")
                //type 请求的数据格式
                .type(MediaType.APPLICATION_JSON)
                .post(new User(1, "Link", "ChangZhou", null));

    }

    /**
     * 查询
     */
    @Test
    public void doGet(){

        WebClient
                .create("http://localhost:8001/webservice/userService/user/1")
                //type 请求的数据格式
                .type(MediaType.APPLICATION_XML)
                //accept 响应的数据格式
                .accept(MediaType.APPLICATION_JSON)
                .get(User.class);

    }

}

package cn.link.springjaxrs;

import cn.link.api.rest.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

/**
 * @author Link
 * @version 1.0
 * @date 2020/8/18 9:57
 */
public class Client {

    @Test
    public void clientTest() {


        //访问地址：...+ CXFServlet路径 + 配置映射路径 + (接口的@Path路径) + 方法的 @Path 路径
        User user = WebClient
                            .create("http://localhost:8080/spring-jaxrs/webservice/userService/userService/user/1")
                            .accept(MediaType.APPLICATION_JSON)
                            .get(User.class);

        System.out.println(user);

    }


}

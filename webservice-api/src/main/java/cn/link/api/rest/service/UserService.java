package cn.link.api.rest.service;

import cn.link.api.rest.entity.User;

import javax.ws.rs.*;

/**
 * @author Link
 * @version 1.0
 * @date 2020/8/17 22:04
 */
@Path("/userService") //访问当前服务接口的映射路径
@Produces("*/*") //服务器支持的返回的数据格式类型
public interface UserService {

    /**
     * 请求方式  @POST
     * 请求路径  @Path
     * 服务器支持的请求的数据格式类型 @Consumes
     */
    @POST
    @Path("/user")
    @Consumes({"application/xml", "application/json"})
    void saveUser(User user);

    @PUT
    @Path("/user")
    @Consumes({"application/xml", "application/json"})
    void updateUser(User user);

    @DELETE
    @Path("/user/{id}")
    @Consumes({"application/xml", "application/json"})
    void deleteUser(@PathParam("id") Integer id);

    @GET
    @Path("/user/{id}")
    @Consumes({"application/xml", "application/json"})
    User queryUser(@PathParam("id") Integer id);

}

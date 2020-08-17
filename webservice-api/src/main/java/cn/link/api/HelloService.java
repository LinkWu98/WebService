package cn.link.api;

import javax.jws.WebService;

/**
 * 对外发布服务的接口 (基于soap)
 *
 * @author Link
 * @version 1.0
 * @date 2020/8/17 19:58
 */
@WebService
public interface HelloService {

    String hello(String hello);

}

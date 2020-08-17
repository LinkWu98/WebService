package cn.link.jaxrs.service;

import cn.link.api.rest.entity.User;
import cn.link.api.rest.service.UserService;

/**
 * 服务实体类
 *
 * @author Link
 * @version 1.0
 * @date 2020/8/17 22:14
 */
public class UserServiceImpl implements UserService {

    @Override
    public void saveUser(User user) {
        System.out.println("save");
    }

    @Override
    public void updateUser(User user) {
        System.out.println("save");
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("save");
    }

    @Override
    public User queryUser(Integer id) {
        return new User(1, "Link", "ChangZhou", null);
    }

}

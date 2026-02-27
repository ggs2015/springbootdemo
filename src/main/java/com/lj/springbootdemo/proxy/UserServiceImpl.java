package com.lj.springbootdemo.proxy;

/**
 * @author liujun
 * @date 2025/2/25
 */
public class UserServiceImpl implements UserService {

    @Override
    public void addUser(String username) {
        System.out.println("UserServiceImpl: Adding user - " + username);
    }

    @Override
    public void deleteUser(String username) {
        System.out.println("UserServiceImpl: Deleting user - " + username);
    }
}

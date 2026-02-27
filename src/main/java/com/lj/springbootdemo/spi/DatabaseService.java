package com.lj.springbootdemo.spi;

/**
 * @author liujun
 * @date 2025/2/25
 */
public interface DatabaseService {

    void connect();

    void query(String sql);
}

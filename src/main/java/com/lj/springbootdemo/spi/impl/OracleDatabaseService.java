package com.lj.springbootdemo.spi.impl;

import com.lj.springbootdemo.spi.DatabaseService;

/**
 * @author liujun
 * @date 2025/2/25
 */
public class OracleDatabaseService implements DatabaseService {

    @Override
    public void connect() {
        System.out.println("Oracle Database connected");
    }

    @Override
    public void query(String sql) {
        System.out.println("Oracle executing query: " + sql);
    }
}

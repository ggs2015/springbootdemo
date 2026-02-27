package com.lj.springbootdemo.spi;

import java.util.ServiceLoader;

/**
 * @author liujun
 * @date 2025/2/25
 */
public class SpiDemo {

    public static void main(String[] args) {
        System.out.println("=== Java SPI Demo ===");

        ServiceLoader<DatabaseService> serviceLoader = ServiceLoader.load(DatabaseService.class);

        for (DatabaseService databaseService : serviceLoader) {
            System.out.println("\n--- Found DatabaseService implementation ---");
            databaseService.connect();
            databaseService.query("SELECT * FROM users");
        }
    }
}

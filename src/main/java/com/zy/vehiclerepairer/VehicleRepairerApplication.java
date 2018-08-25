package com.zy.vehiclerepairer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.zy")
@MapperScan("com.zy.vehiclerepairer.mapper")
public class VehicleRepairerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleRepairerApplication.class, args);
    }
}

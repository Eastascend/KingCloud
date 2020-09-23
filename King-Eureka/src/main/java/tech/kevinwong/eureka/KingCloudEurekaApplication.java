package tech.kevinwong.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Program: KingCloud
 * @Class: tech.kevinwong.eureka.KingCloudEurekaApplication
 * @Description: KingCloud Eureka Server
 * @Author: Eastascend <EastascendWang@gmail.com>
 * @Date: 2020-09-18 14:25
 **/
@EnableEurekaServer
@SpringBootApplication
public class KingCloudEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(KingCloudEurekaApplication.class, args);
    }
}

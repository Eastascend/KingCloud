package tech.kevinwong.client;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Program: King-Client
 * @Class: KingCloudClientApp
 * @Description:
 * @Author: Eastascend <EastascendWang@gmail.com>
 * @Date: 2020-09-22 15:54
 **/
@SpringCloudApplication
@EnableEurekaClient
public class KingCloudClientApp {
    public static void main(String[] args) {
        SpringApplication.run(KingCloudClientApp.class, args);
    }
}

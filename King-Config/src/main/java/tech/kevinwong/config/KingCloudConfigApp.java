package tech.kevinwong.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Program: King-Cloud
 * @Class: KingCloudConfigApp
 * @Description:
 * @Author: Eastascend <EastascendWang@gmail.com>
 * @Date: 2020-09-23 16:09
 **/
@SpringCloudApplication
@EnableDiscoveryClient
public class KingCloudConfigApp {
    public static void main(String[] args) {
        SpringApplication.run(KingCloudConfigApp.class, args);
    }
}

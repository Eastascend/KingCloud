package tech.kevinwong.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Program: King-Cloud
 * @Class: KingCloudGatewayApp
 * @Description:
 * @Author: Eastascend <EastascendWang@gmail.com>
 * @Date: 2020-09-24 14:17
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class KingCloudGatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(KingCloudGatewayApp.class, args);
    }
}

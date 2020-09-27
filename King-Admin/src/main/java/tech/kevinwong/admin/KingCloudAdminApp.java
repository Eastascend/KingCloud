package tech.kevinwong.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Program: King-Cloud
 * @Class: KingCloudAdminApp
 * @Description: KingCloud Admin
 * @Author: Eastascend <EastascendWang@gmail.com>
 * @Date: 2020-09-23 18:18
 **/
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class KingCloudAdminApp {
    public static void main(String[] args) {
        SpringApplication.run(KingCloudAdminApp.class, args);
    }
}

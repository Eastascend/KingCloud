package tech.kevinwong.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Program: KingCloud
 * @Class: KingCloudConfigApplication
 * @Description:
 * @Author: Eastascend <EastascendWang@gmail.com>
 * @Date: 2020-09-18 14:49
 **/
@SpringCloudApplication
@EnableConfigServer
public class KingCloudConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(KingCloudConfigApplication.class, args);
    }
}

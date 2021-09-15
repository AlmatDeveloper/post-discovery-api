package kz.dar.intership.summer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PostDiscoveryApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostDiscoveryApiApplication.class, args);
    }

}

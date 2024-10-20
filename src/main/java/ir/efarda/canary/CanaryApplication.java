package ir.efarda.canary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CanaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanaryApplication.class, args);
    }

}

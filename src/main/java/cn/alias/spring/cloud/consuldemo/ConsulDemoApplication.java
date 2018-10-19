package cn.alias.spring.cloud.consuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ConsulDemoApplication {

    @RequestMapping(value = "/hi")
    public String hi(){
        return "hello world !";
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsulDemoApplication.class, args);
    }
}

package REGISTRY.PMAEUREKA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PmaeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmaeurekaApplication.class, args);
	}

}

package uk.ac.ebi.spot.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class GwasZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GwasZuulGatewayApplication.class, args);
	}

}

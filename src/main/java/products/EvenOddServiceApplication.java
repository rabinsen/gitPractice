package products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
public class EvenOddServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvenOddServiceApplication.class, args);
	}
}

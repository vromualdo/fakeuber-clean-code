package br.com.vsromualdo.fakeuber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FakeUberCleanCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FakeUberCleanCodeApplication.class, args);
	}

}

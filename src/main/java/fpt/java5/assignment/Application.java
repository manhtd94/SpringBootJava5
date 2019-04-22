package fpt.java5.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "fpt.java5.assignment")
// Off security (exclude = { SecurityAutoConfiguration.class })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

package learn.ms.moviesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MoviesServiceApplication {

	@Bean
	public RestTemplate getResTemplateSingletonObject(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(MoviesServiceApplication.class, args);
	}

}

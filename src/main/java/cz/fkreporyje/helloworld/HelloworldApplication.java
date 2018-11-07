package cz.fkreporyje.helloworld;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.exit;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(HelloworldApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}


}

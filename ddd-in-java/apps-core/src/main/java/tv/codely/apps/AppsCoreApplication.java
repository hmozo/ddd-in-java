package tv.codely.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"tv.codely.apps.mooc.controller.healthcheck", 
		"tv.codely.apps.mooc.controller.courses", "tv.codely.mooc.application.create",
		"tv.codely.mooc.infrastructure"})
public class AppsCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppsCoreApplication.class, args);
	}

}

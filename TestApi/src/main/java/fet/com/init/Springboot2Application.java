package fet.com.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;


@Configuration
@SpringBootApplication
@ComponentScan(basePackages = { "fet.com" })
public class Springboot2Application extends SpringBootServletInitializer {

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
		return springApplicationBuilder.sources(Springboot2Application.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Springboot2Application.class, args);
	}

	@EventListener(Springboot2Application.class)
	public void doSomethingAfterStartup() {
		System.out.println("hello world, I have just started up");
	}

}
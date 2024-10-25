package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.controllers.AuthorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);

		AuthorController controller = (AuthorController) ctx.getBean("authorController");
		System.out.println(controller.getAuthors());
	}
}

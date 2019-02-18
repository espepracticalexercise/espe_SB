package espe.edu.ec.crud_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"espe.edu.ec.crud_app"})
public class CrudAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudAppApplication.class, args);
        System.out.println("Crudd_App Santiago Recalde");
    }

}
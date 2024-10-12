package pe.edu.cibertec.app_cl2_service_mant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppCl2ServiceMantApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCl2ServiceMantApplication.class, args);
	}

}

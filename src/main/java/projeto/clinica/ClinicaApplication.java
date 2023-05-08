package projeto.clinica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Serializable;

@SpringBootApplication
public class ClinicaApplication implements Serializable {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaApplication.class, args);
	}
}

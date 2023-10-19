package io.padraoprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "io.padraoprojeto.veiculo")
public class PadraoProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoProjetoSpringApplication.class, args);
	}

}

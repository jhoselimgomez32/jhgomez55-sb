package uan.edu.co.jhgomezsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JhgomezSbApplication {

	@RequestMapping("/PRUEBAS DESPLIEGUE CON HEROKU - JHOSELIM GOMEZ")
	@ResponseBody
	String home() {
		return "PRUEBAS DESPLIEGUE CON HEROKU - JHOSELIM GOMEZ";
	}

	public static void main(String[] args) {
		SpringApplication.run(JhgomezSbApplication.class, args);
	}

}

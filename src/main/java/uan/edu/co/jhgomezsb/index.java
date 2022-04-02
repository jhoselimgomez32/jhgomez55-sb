package uan.edu.co.jhgomezsb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {
    @GetMapping("/")
    String home() {
        return "PRUEBAS DESPLIEGUE CON HEROKU - JHOSELIM GOMEZ";
    }
}
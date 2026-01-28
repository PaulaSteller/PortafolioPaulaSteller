package Tienda_Paula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // <--- CORREGIDO: Solo se usa la anotación base
@ComponentScan (basePackages = {"Tienda_Paula", "com.tienda"}) // cambios
public class TiendaPaulaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiendaPaulaApplication.class, args);
    }
}

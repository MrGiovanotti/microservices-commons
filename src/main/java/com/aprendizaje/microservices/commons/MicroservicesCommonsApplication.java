package com.aprendizaje.microservices.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
// Sobreescribimos @EnableAutoconfigurations, para que no configure ninguna conexión a BDD,
//ya que no la necesitamos
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class MicroservicesCommonsApplication {
	// Quitamos el main porque no necesitamos ejecutar esta clase, ya que solo va a
	// ser una librería
}

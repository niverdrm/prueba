package com.example.CatalogoPeliculas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CatalogoPeliculasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoPeliculasApplication.class, args);
	}

}

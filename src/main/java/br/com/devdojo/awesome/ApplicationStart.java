package br.com.devdojo.awesome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// classe responsável por startar o projeto

   @SpringBootApplication // mesma coisa que @Configuration @EnableAutoConfiguration @ComponenteScaner
    public class ApplicationStart {

        public static void main(String[] args) {
            SpringApplication.run(br.com.devdojo.awesome.ApplicationStart.class, args);
        }
    }



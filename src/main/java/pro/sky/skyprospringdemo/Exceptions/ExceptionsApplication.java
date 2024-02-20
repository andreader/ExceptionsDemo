package pro.sky.skyprospringdemo.Exceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pro.sky.skyprospringdemo.Exceptions.domain.Driver;
import pro.sky.skyprospringdemo.Exceptions.domain.Person;
import pro.sky.skyprospringdemo.Exceptions.domain.TruckDriver;

@SpringBootApplication
public class ExceptionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionsApplication.class, args);
    }
}

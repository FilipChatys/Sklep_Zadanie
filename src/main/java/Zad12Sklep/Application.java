package Zad12Sklep;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    List<Product> listOfProduct = new ArrayList<>();

    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);



    }

}

package Zad12Sklep;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Scanner;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Iterable<Object> findByNameContaining(String name);
}



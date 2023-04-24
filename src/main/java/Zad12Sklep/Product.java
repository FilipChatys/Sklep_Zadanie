package Zad12Sklep;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    private Long id;
    String name;
    String barcode;
    Integer quantity;

}

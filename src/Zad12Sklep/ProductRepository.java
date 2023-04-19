package Zad12Sklep;

import java.util.Scanner;

public class ProductRepository {

    private static Scanner scanner = new Scanner(System.in);

    private long kodKreskowy = scanner.nextLong();
    private final Items[] products = new Items[10];

    public ProductRepository() {

        this.products[0] = new Items("Nagakiba", 5249316782401L, 2);
        this.products[1] = new Items("Lucerne Hammer", 9031452780259L, 3);
        this.products[2] = new Items("Roman Gladius", 1120671823094L, 1);
        this.products[3] = new Items("Estoc", 9746130825700L, 6);
        this.products[4] = new Items("Flamberge", 1425367980197L, 3);
        this.products[5] = new Items("Rapier", 7410258963159L, 6);
        this.products[6] = new Items("Panabas", 9632154870158L, 4);
        this.products[7] = new Items("Uchigatana", 3692147581032L, 2);
        this.products[8] = new Items("Falcata", 1254783469025L, 4);
        this.products[9] = new Items("Sasumata", 3015482659830L, 3);

    }

    public Items[] getProducts() {
        return products;
    }
}



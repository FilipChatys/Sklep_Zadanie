package Zad12Sklep;

import java.util.Scanner;


public class GUI {


    private static Scanner scanner = new Scanner(System.in);


    public static String showMenu(){

        System.out.println("1. Login");
        System.out.println("2. Sign in");
        System.out.println("3. Exit");

        //String wczytanie = scanner.nextLine();

        return scanner.nextLine();
    }

    public static String showMenuAfterLogin(){

        System.out.println("1. List products");
        System.out.println("2. Buy products");
        System.out.println("3. Logout");


        return scanner.nextLine();
    }

    public static void listItems(Items[] products) {
        for(Items items : products) {
            System.out.println(items);
        }
    }

    public static String readProductBarcode() {
        System.out.println("Please provide barcode for wanted item: ");

        return scanner.nextLine();
    }

    public static User readLoginAndPassword(){
        System.out.println("Login:");
        String login = scanner.nextLine();
        System.out.println("Password:");
        return new User(login, scanner.nextLine());
    }
}



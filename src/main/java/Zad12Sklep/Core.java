package Zad12Sklep;

import java.util.Scanner;

public class Core {

    Scanner scanner = new Scanner(System.in);

//    private final ProductRepository database = new ProductRepository();

    private final LoginAndPassword userchecking = new LoginAndPassword();

    private final GUI gui = new GUI();


    public void start() {
//Logowanie

        mainloop:
        while (true) {

            switch (gui.showMenu()) {
                case "1":



                    loginloop:
                    while (true) {

                        switch (gui.showMenuAfterLogin()) {

                            case "1":

                                System.out.println();

                            case "2":

                            case "3":

                                break loginloop;

                        }

                    }

                case "2":


                case "3":

                    break mainloop;

                default:
                    System.out.println("Niewłaściwy input, wybierz opcję 1, 2 lub 3");
                    break;
            }

        }

    }
}

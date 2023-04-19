
package Zad11DziedziczenieFigury;

import Zad11DziedziczenieFigury.KlasyGlowne.AnalizatorFigor;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj ilość liczb, ktora bedzie iloscia bokow figury (od 3 do 6): ");
        int n = scanner.nextInt();

        // Stwórz pustą tablicę o rozmiarze n
        int[] numbers = new int[n];

        // Wczytaj liczby oddzielone spacją i zapisz do tablicy
        System.out.print("Podaj liczby oddzielone spacją: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        AnalizatorFigor wynik = new AnalizatorFigor(numbers);

        System.out.println(wynik);

    }
}

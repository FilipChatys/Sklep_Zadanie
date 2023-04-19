package Zad11DziedziczenieFigury;
import Zad11DziedziczenieFigury.KlasyGlowne.AnalizatorFigor;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Podaj ile razy chcesz uruchomic kalkulator (czyli ile figor chcesz zbadac)");

        Scanner scanner = new Scanner(System.in);

        int ilosc_figur = scanner.nextInt();
        int ilosc_wywolan = 0;


        while (ilosc_wywolan < ilosc_figur) {

            System.out.print("Podaj ilość liczb, ktora bedzie iloscia bokow figury (1 dla promienia kola albo od 3 do " +
                    "6 dla pozostalych figur): ");
            int n = scanner.nextInt();

            // Stwórz pustą tablicę o rozmiarze n
            int[] numbers = new int[n];

            // Wczytaj liczby oddzielone spacją i zapisz do tablicy
            System.out.print("Podaj liczby oddzielone spacją: ");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            AnalizatorFigor wynik = new AnalizatorFigor(numbers);

            ilosc_wywolan += 1;
        }
    }
}

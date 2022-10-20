import java.util.Scanner;

public class Prosty_kalkulator_Mikolaj_Lapinski {
    public static void main(String[] args) {
        float pierwszy;
        float drugi;

        Scanner Uzytkownik = new Scanner(System.in);
        System.out.println("Podaj, pierwszą liczbę: ");
        pierwszy = Uzytkownik.nextFloat();
        System.out.println("Druga liczba: ");
        drugi = Uzytkownik.nextFloat();

        System.out.println("Dodawanie: " + (pierwszy+drugi));
        System.out.println("Odejmowanie: " + (pierwszy-drugi));
        System.out.println("Mnożenie: "+(pierwszy*drugi));
        System.out.println("Dzielenie: "+(pierwszy/drugi));
    }

}

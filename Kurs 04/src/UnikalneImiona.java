import java.util.*;

public class UnikalneImiona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> imiona = new HashSet<>();

        System.out.println("imiona: (wpisz '-' aby skonczyc)");

        while (true) {
            String imie = scanner.nextLine();
            if (imie.equals("-")) break;
            imiona.add(imie);
        }

        System.out.println("Liczba unikalnych imion: " + imiona.size());
    }
}
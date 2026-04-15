import java.util.*;



public class ParyImion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> pary = new HashMap<>();

        System.out.println("pary imion:  ('-' aby skonczyc)");


        while (true) {
            System.out.print("Pierwsze imie: ");
            String imie1 = scanner.nextLine();
            if (imie1.equals("-")) break;

            System.out.print("Drugie imie: ");
            String imie2 = scanner.nextLine();

            pary.put(imie1, imie2);
        }

        System.out.print("\nPodaj imie, aby znalezc drugie imie: ");
        String szukane = scanner.nextLine();

        if (pary.containsKey(szukane)) {
            System.out.println("pierwsze imie " + szukane + " drugie imie: " + pary.get(szukane));
        } else {
            System.out.println("Nie znaleziono takiego imienia.");
        }
    }
}


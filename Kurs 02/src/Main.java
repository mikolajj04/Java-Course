//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
//    double celsius = 25.0;
//    double kelvin = celsius + 273.15;
//    double fahrenheit = (celsius * 1.8) + 32;
//
//    System.out.println(celsius + "°C to " + kelvin + "K oraz " + fahrenheit + "°F");
//    int totalSeconds = 3665;
//    int h = totalSeconds / 3600;
//    int m = (totalSeconds % 3600) / 60;
//    int s = totalSeconds % 60;
//
//    System.out.println(h + " h, " + m + " min, " + s + " s");
//    int x = 5;
//    int y = x++;
//    int z = ++x;
//
//    System.out.println("x: " + x + ", y: " + y + ", z: " + z);
//    double weight = 85.0; // kg
//    double height = 1.85; // m
//    double bmi = weight / (height * height);
//
//    System.out.printf("Twoje BMI wynosi: %.2f\n", bmi);

    //zad 2.
//    String password = "Moje1234567";
//    boolean hasLength = password.length() >= 12;
//    boolean hasDigit = password.matches(".*\\d.*");
//    boolean hasUpper = password.matches(".*[A-Z].*");
//    boolean hasLower = password.matches(".*[a-z].*");
//
//    if (hasLength && hasDigit && hasUpper && hasLower) {
//        System.out.println("Haslo jest poprawne");
//    } else {
//        System.out.println("Haslo za slabe");
//    }
//2.2
//    double income = 150000;
//    double tax;
//
//    if (income <= 120000) {
//        tax = income * 0.12;
//    } else {
//        tax = (120000 * 0.12) + ((income - 120000) * 0.32);
//    }
//    System.out.println("Tax: " + tax + " zł");

    //2.3
//    int day = 3;
//    String dayName = switch (day) {
//        case 1 -> "Poniedziałek";
//        case 2 -> "Wtorek";
//        case 3 -> "Środa";
//        case 4 -> "Czwartek";
//        case 5 -> "Piątek";
//        case 6 -> "Sobota";
//        case 7 -> "Niedziela";
//        default -> "Niepoprawny numer dnia";
//    };
//    System.out.println(dayName);


    //2.4
//    int year = 2024;
//    boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//
//    if (isLeap) {
//        System.out.println(year + " to rok przestępny.");
//    } else {
//        System.out.println(year + " to nie jest rok przestępny.");
//    }


    //3.1
//    String input = "Jan Kowalski";
//    System.out.println(input.toUpperCase());
//
//    int spaceIndex = input.indexOf(" ");
//    String lastName = input.substring(spaceIndex + 1);
//    System.out.println("Nazwisko: " + lastName);
//
//    if (lastName.endsWith("a")) {
//        System.out.println("Nazwisko konczy sie 'a'");
//    }


//    3.2
//    int randomNum = (int) (Math.random() * 100) + 1;
//    System.out.println("Wylosowana liczba: " + randomNum);
//
//    if (randomNum % 2 == 0) {
//        System.out.println("Parzysta");
//    }


    //3.3
//    String a = "Napis";
//    String b = new String("Napis");
//
//    System.out.println("Wynik == : " + (a == b));      //  false
//    System.out.println("Wynik equals: " + a.equals(b)); //true


//3.4
//    String text = "przykladowy tekst";
//    String cleanText = text.trim().replace("tekst", "napis");
//
//    System.out.println("'" + cleanText + "'");
//
//

    // 4.1


//    String correctLogin = "admin";
//    String correctPass = "1234";
//
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Login: ");
//    String login = sc.nextLine();
//    System.out.print("Hasło: ");
//    String pass = sc.nextLine();
//
//    if (login.equals(correctLogin) && pass.equals(correctPass)) {
//        System.out.println("Dostęp przyznany");
//    } else {
//        System.out.println("Błąd logowania");
//    }


    //4.2
//
//    double n1 = 10.5, n2 = 20.3, n3 = 5.7;
//
//    double max = Math.max(n1, Math.max(n2, n3));
//    double min = Math.min(n1, Math.min(n2, n3));
//    double avg = (n1 + n2 + n3) / 3;
//
//    System.out.println("Max: " + max);
//    System.out.println("Min: " + min);
//    System.out.printf("Avg: %.2f\n", avg);



    //4.3
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Podaj cenę produktu: ");
    double price = sc.nextDouble();

    System.out.print("Podaj wiek klienta: ");
    int age = sc.nextInt();

    double finalPrice;

    if (age < 18) {
        // Zniżka 20%, czyli klient płaci 80% ceny
        finalPrice = price * 0.8;
        System.out.println("Zastosowano zniżkę dla nieletnich (20%).");
    } else if (age > 65) {
        // Zniżka 30%, czyli klient płaci 70% ceny
        finalPrice = price * 0.7;
        System.out.println("Zastosowano zniżkę dla seniorów (30%).");
    } else {
        finalPrice = price;
        System.out.println("Brak zniżek – cena standardowa.");
    }


    System.out.println("Finalna cena: " + String.format("%.2f", finalPrice) + " zł");

    sc.close();
}


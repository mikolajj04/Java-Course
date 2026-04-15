import java.lang.foreign.SymbolLookup;
import java.util.*;
import java.util.stream.*;

public class Streams {
    public static void main(String[] args) {
        List<Integer> liczby = List.of(1, 2, 3, 11, 15, -2, 5, 8, 10, 4);
        List<Integer> liczby2 = List.of(0, 2, 3, 11, 15, -2, 5, 8, 10, 4);
        List<String> imiona = List.of("Adam", "Anna", "Maks", "Andrzej", "Pawel");
        //1.
        List<Integer> Even = liczby.stream().filter(n -> n % 2 == 0).toList();
        //2.
        List<String> UpperCaseNames = imiona.stream().map(String::toUpperCase).toList();
        //3.
        List<Integer> Descending = liczby.stream().sorted(Comparator.reverseOrder()).toList();
        //4.
        int suma = liczby.stream().reduce(0, Integer::sum);

        //5.
        long countA = imiona.stream().filter(s -> s.startsWith("A")).count();
        //6.
        Optional<Integer> FirstGreater = liczby.stream().filter(n -> n > 10).findFirst();
        //7.
        Optional<Integer> MinVal = liczby.stream().min(Integer::compare);
        //8.
        Optional<Integer> MaxVal = liczby.stream().max(Integer::compare);
        //9.
        boolean allPositive = liczby.stream().allMatch(n -> n > 0);
        //10.
        boolean anyNegative = liczby.stream().anyMatch(n -> n < 0);
        //11.
        String[] namesArray = imiona.stream().toArray(String[]::new);
        //12.
        List<String> sortedNames = imiona.stream().sorted().toList();
        // 13.
        Stream<Integer> concat = Stream.concat(liczby.stream(), liczby2.stream());
        // 14.
        List<List<Integer>> listaList = List.of(List.of(1, 2), List.of(3, 4));
        List<Integer> flated = listaList.stream().flatMap(List::stream).toList();



        //15.
        List<Integer> first5 = liczby.stream().limit(5).toList();
        //16.
        List<Integer> skipFirst3 = liczby.stream().skip(3).toList();
        //17.
        imiona.stream().forEach(System.out::println);
        //18.
        int[] tab={1,2,3};
        IntStream intStream = Arrays.stream(tab);
        //19.
        Stream<String> abcStream = Stream.of("a", "b", "c");
        //20.
        List<Integer> randomInt = new Random().ints(10).boxed().toList();






    }
}

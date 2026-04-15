import com.sun.source.tree.NewArrayTree;
import com.sun.source.tree.Tree;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Pair<K,V>{
    private K key;
    private V value;

    public Pair(K key,V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){ return key;}
    public V getValue(){return value;}
}


public class Main {
    public static void main(String[] args) {
        // Tworzymy dwa obiekty o identycznej zawartości
        List<String> kursy = List.of("Java", "Bazy Danych");
        Person<String> s1 = new Person<>("Mikołaj", 123, kursy, "Wydział AEI");
        Person<String> s2 = new Person<>("Mikołaj", 123, kursy, "Wydział AEI");

        // 3. Utwórz kilka kolekcji

        List<Person<String>> listaStudentow = new ArrayList<>();
        listaStudentow.add(s1);

        Set<Person<String>> zbiorStudentow = new HashSet<>();
        zbiorStudentow.add(s1);
        zbiorStudentow.add(s2); // Dzięki hashCode/equals NIE doda duplikatu!

        // 4. Porównaj dwa takie same obiekty
        System.out.println("Czy s1 == s2? " + (s1 == s2)); // false (różne miejsca w pamięci)
        System.out.println("Czy s1.equals(s2)? " + s1.equals(s2)); // true (te same dane)

        // 5. Porównaj wyniki metody hashCode
        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
        System.out.println("Czy hashCodes są równe? " + (s1.hashCode() == s2.hashCode()));
    }
}

//public class Main {
//    public static void main(String[] args) {
//
//        //1
//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(1);
//        num.add(2);
//        num.add(3);
//        num.add(4);
//        num.add(5);
//        //2
//        LinkedList<Integer> linkedNum = new LinkedList<>(List.of(2,3));
//        linkedNum.remove(0);
//        // 3.
//        HashSet<String> hashSet = new HashSet<>(Set.of("A", "B"));
//        boolean contains = hashSet.contains("B");
//
//        // 4.
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        treeSet.add(50);
//        treeSet.add(10);
//        treeSet.add(30);
//
//
//        // 5.
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(100);
//
//        //6.
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("klucz", "wartosc");
//        String wartosc = hashMap.get("klucz");
//
//        // 7.
//        for (Integer numm : linkedNum) { System.out.println(numm); }
//        // 8.
//        hashSet.forEach(e -> System.out.println(e));
//        // 8.
//        hashSet.forEach(e -> System.out.println(e));
//        // 9.
//        for (Integer n : pq) { System.out.println(n); }
//        // 10.
//        TreeMap<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("Z", 1);
//        treeMap.put("A", 2);
//        for (String key : treeMap.keySet()) { System.out.println(key); }
//
//
//
//
//
//
//
//        // 11.
//        Queue<String> queue = new LinkedList<>();
//        queue.add("Zad 1");
//        // 12.
//        pq.poll();
//        // 13.
//        boolean isTreeEmpty = treeSet.isEmpty();
//        // 14.
//        Set<String> keys = hashMap.keySet();
//        // 15.
//        linkedNum.add(99);
//        // 16.
//        num.remove(0);
//        //17
//        int sizeSet = hashSet.size();
//        //18.
//        int sizeMap = treeMap.size();
//        //19.
//        Integer firstPq = pq.peek();
//        //20.
//        String lastLinked = linkedNum.getLast().toString();
//
//
//
//
//
//    }
//    public static <T> boolean isEqual(T a, T b){
//        return a.equals(b);
//    }
//}

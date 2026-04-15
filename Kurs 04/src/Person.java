import java.util.*;

public class Person<T> {
    private String imie;
    private Integer id;
    private List<String> kursy;
    private T dodatkoweDane;

    public Person(String imie, Integer id, List<String> kursy, T dodatkoweDane) {
        this.imie = imie;
        this.id = id;
        this.kursy = kursy;
        this.dodatkoweDane = dodatkoweDane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person<?> czlowiek = (Person<?>) o;
        return Objects.equals(imie, czlowiek.imie) &&
                Objects.equals(id, czlowiek.id) &&
                Objects.equals(kursy, czlowiek.kursy) &&
                Objects.equals(dodatkoweDane, czlowiek.dodatkoweDane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, id, kursy, dodatkoweDane);
    }
}
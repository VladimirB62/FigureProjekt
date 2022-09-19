import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();

        numbers.add(28);
        numbers.add(7);
        numbers.add(6);
        numbers.add(9);
        numbers.add(12);
        numbers.add(49);
        numbers.add(30);

        Collections.sort(numbers);
        System.out.println(numbers);

        List<String> strings = new ArrayList<>();

        strings.add("Ella");
        strings.add("Karl");
        strings.add("Nelli");
        strings.add("Mark");
        strings.add("Pol");
        strings.add("Stiw");

        Collections.sort(strings);
        System.out.println(strings);


    }
}
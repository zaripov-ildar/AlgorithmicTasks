package StreamAPITasks;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    private static final List<String> names = List.of(
            "Marshal",
            "Smith",
            "Melony",
            "Bach",
            "McConey",
            "Adams"
    );
    public static void main(String[] args) {
        sortStringList();

    }

    private static void countEven() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 89, 35, 8, 9, 4, 2, 0);
        list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void findEmployeeByFirstLetter(){
        names.stream()
                .filter(n->n.startsWith("M"))
                .forEach(System.out::println);
    }

    private static void sortStringList(){
        names.stream()
                .sorted((Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}

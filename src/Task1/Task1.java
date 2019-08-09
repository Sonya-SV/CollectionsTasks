package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));

        arrayList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((value, count) -> System.out.println(value +" - " +count));

    }
}

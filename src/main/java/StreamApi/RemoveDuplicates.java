package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 3, 5, 9, 3);
        // output- distinct elements

//        Set<Integer> set =numbers.stream().collect(Collectors.toSet());
//        System.out.println(set);    // Set does not maintain insertion order.

        List<Integer> list = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}

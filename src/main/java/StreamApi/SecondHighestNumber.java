package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> second = Arrays.asList(5,9,11,2,8,21,21,1);
        Optional<Integer> secondhighest = second.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondhighest.get());
    }
}

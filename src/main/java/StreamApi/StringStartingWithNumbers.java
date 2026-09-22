package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartingWithNumbers {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","1Apple","Banana","5Apricot","Kerelaa");
        List<String> numString = fruits.stream().filter(s-> Character.isDigit(s.charAt(0))).collect(Collectors.toList());
        System.out.println(numString);
    }
}
//   Print directly -->  fruits.stream().filter(s-> Character.isDigit(s.charAt(0))).forEach(System.out::println);


package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//{orange=1, banana=2, apple=3}

public class CountOccurence {
    public static void main(String[] args) {
        List<String> items= Arrays.asList("apple","banana","apple","orange","banana","apple");
        Map<String,Long> count= items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count);
    }
}
//Collectors.groupingBy is used to group elements based on a key.
//Function.identity()->Use the element itself as the key
//["apple", "banana", "apple", "orange", "banana", "apple"]
//{
//  "apple":   ["apple", "apple", "apple"],
//  "banana":  ["banana", "banana"],
//  "orange":  ["orange"]
//}
//Collectors.counting()- to count the number of elements

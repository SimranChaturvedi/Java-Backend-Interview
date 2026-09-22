package Practice_Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // even numbers
//     numbers.stream().filter(n-> n% 2==0).forEach(System.out::println);

        //greater than 25
           numbers.stream().filter(n->n>25).forEach(System.out::println);

        //print strings with length greater than 4
        List<String> names =
                Arrays.asList("java", "spring", "microservices", "aws");
        names.stream().filter(n->n.length()>4).forEach(System.out::println);

        //Return a List<Integer> containing only even numbers greater than 20.
      List<Integer> newnum=  numbers.stream().filter(n -> n > 20 && n % 2 == 0).collect(Collectors.toList());
        System.out.println(newnum);

        //Return a List containing unique numbers greater than 15, in ascending order.
        //[20, 30, 40, 50]
        List<Integer> num =
                Arrays.asList(10, 20, 5, 30, 20, 40, 10, 50);

        List<Integer> result= num.stream().filter(n->n>15).distinct().sorted().collect(Collectors.toList());
        System.out.println(result);

    }
}

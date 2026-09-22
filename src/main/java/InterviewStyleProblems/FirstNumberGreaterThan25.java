package InterviewStyleProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstNumberGreaterThan25 {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        //Expected - 30

        Optional<Integer> num = numbers.stream().filter(n->n>25).findFirst();
        System.out.println(num);


    }
}

package InterviewStyleProblems;

import java.util.Arrays;
import java.util.List;

public class NumberOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        //Expected - 4

        long count = numbers.stream().filter(n->n%2==0).count();
        System.out.println(count);
    }
}

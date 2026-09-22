package InterviewStyleProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintDuplicateNumbers {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 20, 10, 30, 20, 10, 40);
        //Expected 10  , 20

        Map<Integer,Long> frequency = numbers.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));

        List<Integer> duplicates = frequency.entrySet().stream().filter(n->n.getValue()>1).map(n->n.getKey()).collect(Collectors.toList());
        System.out.println(duplicates);
    }
}


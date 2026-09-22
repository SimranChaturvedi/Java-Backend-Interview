package InterviewStyleProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfElements {
    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 20, 10, 30, 20, 10, 40);
        //Expected
//        10 → 3
//        20 → 2
//        30 → 1
//        40 → 1

        Map<Integer,Long> frequency= numbers.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(frequency);

    }
}

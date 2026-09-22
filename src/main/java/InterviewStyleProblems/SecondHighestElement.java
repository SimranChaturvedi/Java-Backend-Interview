package InterviewStyleProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondHighestElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 10, 40, 30, 20);

        Map<Integer, Long> freq= list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
//        List<Integer> secondhighest = freq.entrySet().stream().map(n->n.getValue()).skip(1);
    }
}

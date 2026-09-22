package InterviewStyleProblems;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class HighestFrequencyOfElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5, 10, 15, 10, 20, 5, 25, 10);

        Map<Integer,Long> frequency= list.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));

        Optional<Map.Entry<Integer, Long>> highestfreq = frequency.entrySet().stream()
                .max(Comparator.comparing(n->n.getValue()));
        System.out.println(highestfreq.get().getKey());

    }
}

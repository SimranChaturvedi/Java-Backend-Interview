package InterviewStyleProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class firstNonRepeatingElement {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 20, 10, 30, 20, 40, 30);
        //expected = 40
        Map<Integer, Long> frequency =
                numbers.stream()
                        .collect(Collectors.groupingBy(n->n,Collectors.counting()));
        Optional<Integer> fistNonRepeating = frequency.entrySet().stream().filter(n->n.getValue()==1).map(n->n.getKey()).findFirst();
        System.out.println(fistNonRepeating.get());
    }
}

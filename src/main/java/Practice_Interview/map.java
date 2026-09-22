package Practice_Interview;

import java.util.Arrays;
import java.util.List;

public class map {
    public static void main(String[] args) {
        List<String> names =
                Arrays.asList("java", "spring", "aws", "docker");

        //print every name in uppercase.
        names.stream().map(n->n.toUpperCase()).forEach(System.out::println);

        //Find names whose length is greater than 3 and convert them to uppercase.
        names.stream().filter(n->n.length()>3).map(n->n.toUpperCase()).forEach(System.out::println);

    }
}
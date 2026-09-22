package Practice_Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sort {
    public static void main(String[] args) {

        //sort the numbers it always sort in ascending order
        List<Integer> number= Arrays.asList(20,10,40,3,90,60);
        number.stream().sorted().forEach(System.out::println);

        //sort in reverse/descending order
        List<Integer> num= Arrays.asList(20,10,40,3,90,60);
        num.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}

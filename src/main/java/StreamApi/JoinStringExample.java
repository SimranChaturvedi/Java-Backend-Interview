package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringExample {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple","Banana","Avacado","Mango","Apricot");
        String joining = fruits.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(joining);
    }
}

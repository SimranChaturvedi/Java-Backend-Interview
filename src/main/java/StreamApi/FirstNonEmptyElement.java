package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstNonEmptyElement {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("","", "Hello", "World","");
        Optional<String> findfirst = strings.stream().filter(s->!s.isEmpty()).findFirst();
        System.out.println(findfirst.get());
    }
}
//(findfirst.get())-> Hello
//(findfirst) -> Optional[Hello]
//If there is no value passed in list - Arrays.asList("","", "");
//use System.out.println(findfirst); output- Optional.empty

//Optional.empty() means: “There is NO value inside”
//.get() is like saying:  “Give me the value anyway”
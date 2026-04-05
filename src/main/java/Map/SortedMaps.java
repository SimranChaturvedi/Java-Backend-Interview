package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {
    public static void main(String[] args) {
//        Map<Integer,String> map	=	new LinkedHashMap<Integer,String>();
        Map<Integer,String>	map	=	new TreeMap<Integer,String>();
        map.put(50,	"Fifty");
        map.put(40,	"Fourty");
        map.put(30,	"Thirty");
        map.put(20,	"Twenty");
        map.put(10,	"Ten");
        System.out.println("Map	:	"	+	map);
        }
}

//NOTE:
//TreeMap maintains sorted order of keys.
//LinkedHashmap maintains insertion order of keys.
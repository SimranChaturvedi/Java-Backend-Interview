package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KeySet {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(10,"One");
        map.put(20,"Two");
        map.put(30,"Three");
        map.put(40,"Four");
        System.out.println("Map	is	:	");
        Set<Integer> keys=map.keySet();
        for(Integer key:keys){
            String value= map.get(key);
            System.out.println(key +" = "+value);
        }
    }
}

//Set<K>	keySet():
//• We	cannot	iterate	the	map	object	either	by	using	Iterator	or	using	for-each	loop.
//• First	we	need	to	collect	all	keys	of	map	using	keySet()	method.
//• We	iterate	keys	set	and	get	values	by	specifying	each	key
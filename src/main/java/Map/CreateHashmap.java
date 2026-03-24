package Map;

import java.util.HashMap;
import java.util.Map;

public class CreateHashmap {
    public	static	void	main(String[]	args)
    {
        Map<Integer,String> map	=	new HashMap<Integer,String>();
        map.put(10,	"Ten");
        map.put(20,	"Twenty");
        map.put(30,	"Thirty");
        map.put(40,	"Fourty");
        map.put(50,	"Fifty");
        System.out.println("Map	:	"	+	map);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Engine {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		List cc = new ArrayList<Integer>();
		TreeSet d 
		
		cc.add(null);
		cc.add(null);
		cc.add("");
		
		Collections.unmo
		System.out.println("SIZE="+cc.size());
		cc.remove(null);
		ListIterator i = cc.listIterator();
		while(i.hasNext()) {
			
			Integer in = (Integer)i.next();
			if(in == 7) {
				i.
			}
		}
		
		System.out.println("REMOVED SIZE="+cc.size());
		Set s = new HashSet<>();
        Map map = new HashMap<>();
       
		Bike b = new Bike(10);
		Car c = new Car(20, b);
		System.out.println(c.toString());
		Car clone = (Car)c.clone();
		c.b.i = 999;
		c.i = 30;
		
		
		System.out.println(clone.toString());
		
		
	}

}

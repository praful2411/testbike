import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.executar.Bike;

public class StringTest {
	
	public static void main(String[] args)  {
		
	
		
Map <String,List<Bike>> map = new HashMap<>();
		
		List<Bike> hero = new ArrayList<>();
		
		Bike heroSplender = new Bike(12999,"2019");
		hero.add(heroSplender);
		Bike heropassion = new Bike(16000,"2016");
		hero.add(heropassion);
		Bike heromoped = new Bike(12999,"20555");
		hero.add(heromoped);
		Bike heroExstrema = new Bike(12555,"20444");
		hero.add(heroExstrema);
		Bike heroShine = new Bike(12333,"2077");
		hero.add(heroShine);
		
		map.put("hero", hero);
		
        List<Bike> bajaj = new ArrayList<>();
		
		Bike bajajSplender = new Bike(12999,"2019");
		bajaj.add(bajajSplender);
		Bike bajajpassion = new Bike(16000,"2016");
		bajaj.add(bajajpassion);
		Bike bajajmoped = new Bike(12999,"20555");
		bajaj.add(bajajmoped);
		Bike bajajExstrema = new Bike(12555,"20444");
		bajaj.add(bajajExstrema);
		Bike bajajShine = new Bike(12333,"2077");
		bajaj.add(bajajShine);
		
		map.put("bajaj", bajaj);
		
        List<Bike> apache = new ArrayList<>();
		
		Bike apacheSplender = new Bike(12999,"5021");
		apache.add(apacheSplender);
		Bike apachepassion = new Bike(16000,"5022");
		apache.add(apachepassion);
		Bike apachemoped = new Bike(12999,"5025");
		apache.add(apachemoped);
		Bike apacheExstrema = new Bike(12555,"5024");
		apache.add(apacheExstrema);
		Bike apacheShine = new Bike(12333,"5026");
		apache.add(apacheShine);
		
		map.put("apache", apache);
		
List<Bike> honda = new ArrayList<>();
		
		Bike hondaSplender = new Bike(12999,"2019");
		honda.add(hondaSplender);
		Bike hondapassion = new Bike(16000,"2016");
		honda.add(hondapassion);
		Bike hondamoped = new Bike(12999,"20555");
		honda.add(hondamoped);
		Bike hondaExstrema = new Bike(12555,"20444");
		honda.add(hondaExstrema);
		Bike hondaShine = new Bike(12333,"2077");
		honda.add(hondaShine);
		
		map.put("honda", honda);
		
		System.out.println(map.toString());
	}
		
		
	}



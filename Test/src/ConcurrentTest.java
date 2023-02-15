import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentTest extends Thread{
	
	static Map<String,String> map = new ConcurrentHashMap<>();

	@Override
	public void run() {
		
		map.put("11", "jj");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup group  = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[group.activeCount()];
		group.enumerate(t);
		for(Thread th: t) {
			System.out.println(th.getName()+ " ============  "+th.getPriority());
		}
		
		
		
	}
	

}

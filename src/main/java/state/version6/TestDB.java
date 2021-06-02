package state.version6;

import java.util.HashMap;
import java.util.Map;

public class TestDB {
	public static Map map = new HashMap();

    static{
		Thread t = new Thread( new MemoryDB());
		t.start();
	}
}
class MemoryDB implements Runnable{
	
	@Override
	public void run() {
		while(true){
			//Ò»Ö±ÔËÐÐ×Å
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
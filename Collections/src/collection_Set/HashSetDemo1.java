package collection_Set;
import java.util.*;
public class HashSetDemo1 {

	public static void main(String[] args) {
		Set hs=new HashSet();

		hs.add("RRR");
		hs.add("KGF");
		hs.add("Vikram");
		hs.add("RRR");
		hs.add("Beast");
		hs.add("DON");
		hs.add("BheemlaNayak");
		hs.add("Major");
		hs.add("BheemlaNayak");
		hs.add("Pushpa");
		hs.add("JanaGanaMana");
		
		System.out.println(hs);
		
		System.out.println(hs.contains("RRR"));
		
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

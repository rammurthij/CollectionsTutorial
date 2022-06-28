package collection_List_ArrayList;
import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		// List al=new ArrayList();
		List<String> al=new ArrayList<String>();
		al.add("Ram Murthi");
		al.add("Akhila");
		al.add("Rasool");
		al.add("Raju");
		al.add("Ammu");
	
		for(String s:al) {
		System.out.println(s);
		}
		
//		for(int i = 0; i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
	}

}      




// int size() ---
// Object get( int index) ----

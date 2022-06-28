package collection_List_ArrayList;
import java.util.*;
public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		String arr[]= {"Dog","Goat","Tiger","Lion","Liger"};
		for(String value:arr) {
		System.out.println(value);
		}
		
		List<String> al=new ArrayList<String>(Arrays.asList(arr));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}

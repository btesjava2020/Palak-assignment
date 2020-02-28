package project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorMethod {

	public static void main(String[] args) {
		ArrayList<String>arr=new ArrayList<String>();
		arr.add("ABC");
		arr.add("XYZ");
		arr.add("Riya");
		arr.add("Anu");
		arr.add("Sneha");
      //	for(String s:arr) {
			//System.out.println(s);
		//}
		ListIterator itr=arr.listIterator();
		while(itr.hasNext()) {
			itr.next();
		}

		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

		
	}

}

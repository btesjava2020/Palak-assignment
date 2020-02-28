package project;

import java.util.ListIterator;
import java.util.Vector;

public class List_Iterator {

	public static void main(String[] args) {

Vector a1=new Vector(11);
for(int i=0;i<=10;i++) {
	a1.add(i);
}
System.out.println("size="+a1.size());
System.out.println("capacity="+a1.capacity());
a1.trimToSize();
System.out.println("new capacity="+a1.capacity());


ListIterator itr=a1.listIterator();

while(itr.hasNext()) {
	itr.next();
}
while(itr.hasPrevious()) {
	System.out.println(itr.previous());
}

	}

}

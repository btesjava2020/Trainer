import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListCapacity {

	public static void main(String[] args) {
	
		Vector a1=new Vector(20);
		for(int i=1;i<=11;i++)
		a1.add(i);
		System.out.println("size="+a1.size());
		System.out.println("capacity="+a1.capacity());
		a1.trimToSize();
		System.out.println("new capacity="+a1.capacity());
		ListIterator i1=a1.listIterator();
		while(i1.hasNext()) {
			i1.next();
		}
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
	}

}

package collectionsjune24;
import java.util.*;
public class HashSetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<Integer> num = new HashSet<>();

		    num.add(5);
	        num.add(10);
	        num.add(15);
	        num.add(20);
	        num.add(25);
	        
	        System.out.println("HashSet elements: " + num);
	        
	        boolean containsTen = num.contains(10);
	        System.out.println("Does the set contain the number 10? " + containsTen);
	        num.remove(15);
	        int size = num.size();
	        System.out.println("Size of the set after removing 15: " + size);
	    }
	}

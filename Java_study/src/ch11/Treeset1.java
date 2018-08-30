package ch11;

import java.util.*;

public class Treeset1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(new NumDescendingOrder());
		
		while(set.size() < 10) {
			set.add((int)(Math.random()*100)+1);
		}
		System.out.println(set);
		System.out.println("50 미만의 값들:"+set.headSet(50));
		System.out.println("50 이상의 값들:"+set.tailSet(50));
	}
}

class NumDescendingOrder implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof Comparable &&
				o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2)*-1;
		}
		
		
	/*   if (o1 instanceof Integer &&
	           o2 instanceof Integer)
	           return (Integer)o2-(Integer)o1;*/
	  
		 
		return -1;
	}
	
}

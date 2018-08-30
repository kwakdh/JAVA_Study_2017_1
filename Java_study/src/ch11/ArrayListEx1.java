package ch11;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(new Integer(5));
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		System.out.println(list1);
		System.out.println(list1.subList(1, 4));
		
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		System.out.println("list2:"+list2);
		
		Collections.sort(list1);
		System.out.println("After sort list1:"+list1);
		Collections.sort(list2);
		System.out.println("After sort list2:"+list2);
		System.out.println("list.containsAll(list2):"+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		System.out.println("list2:"+list2);
		list2.add(3, "A");
		System.out.println("list2:"+list2);
		
		list2.set(3,  "AA");
		System.out.println("list2:"+list2);
		
		list1.retainAll(list2);
		System.out.println("After retainAll:"+list1);
		// list2 : [0, 2, 4, AA, B, C]
		// list1 : [0, 2, 4]
		// list2 - list1
		/* list2에 있는 각 원소에 대해서
		 *   list1이 list2의 현재 원소를 포함하고 있으면 
		 *   list2의 그 원소를 삭제. list2.remove(index);
		 * 
		 */
		/*
		for(int i = list2.size(); i >= 0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);			
			}
		}
		*/
		list2.removeAll(list1);
		System.out.println("list2:" + list2);
			
		
		
		
		
	}

}

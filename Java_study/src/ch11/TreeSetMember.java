package ch11;

import java.util.*;

public class TreeSetMember {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		Member m = new Member("Kim", 20);
		set.add(m);
		
		m = new Member("Park", 21);
		set.add(m);
		
		/*
		 * 1. Member 객체가 TreeSet에 들어갈 수 있게 하라
		 * 2. 이름과 나이가 같은 Member 객체는 중복해서 들어가지 않게 하라.
		 * 3. Member 객체를 TreeSet에 넣으면 자동으로 나이 순으로 정렬되게 하라.
		 * 4. Member 클래스를 수정하지 않고 TreeSet에 들어간 Member 객체들이
		 *    이름 순서로 정렬되도록 하라. 
		 * 
		 */

	}

}

package ch11;

import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		/*
		 * TreeSet 객체 생성, 이 객체를 set이라 하자
		 * set.size()가 6 미만인 동안
		 *   - 1~45 사이의 무작위 정수값을 생성해 set.add 하자.
		 */
		// set에 있는 원소를 하나씩 찍어보면
		// 정수의 오름차순으로 나온다. 
		// HashSet을 이용했을 때는
		// hashset에 로또번호 넣고
		// 정렬하기 위해서 
		// hashset을 가지고 list를 생성했고
		// 그 list를 Collections.sort 메소드를 호출해서
		// 정렬했잖아...
		
		TreeSet set = new TreeSet();
		while(set.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
	}

}

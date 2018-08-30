package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		/* 아래와 같이 Arrays.sort 메소드로 정렬되려면
		 * 배열의 원소의 타입이(class) Comparable 인터페이스를
		 * 구현한 타입(class)이어야 한다. 
		 * 즉, 아래의 경우
		 * strArr 배열의 원소인 문자열(String)은
		 * Comparable 인터페이스를 구현한 타입이다. 
		 */
		Arrays.sort(strArr);
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, new DescendingOrder());
		System.out.println("strArr="+Arrays.toString(strArr));
		//Arrays.sort(배열, Comparator 인터페이스를 구현한 클래스의 객체);
		// 그 방법은 Comparator 인터페이스를 구현한 
		// 클래스의 객체를 넘겨주면 된다.
		
		
		Arrays.sort(strArr, new DescendingOrder2());
		System.out.println("strArr="+Arrays.toString(strArr));

	}
}

class DescendingOrder implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		/*
		 * 
		 */
		/* obj1과 obj2가 Comparable 타입인지 검사 */
		if(obj1 instanceof Comparable && 
				obj2 instanceof Comparable) {
			/*
			 * 두 대상을 비교해서 앞의 것이 크면 양수값
			 * 같으면 0
			 * 뒤의 값이 크면 음수 값 반환
			 * 요렇게 해주면 Arrays.sort 메소드가 
			 * 오름차순 정렬해준다. 
			 * 만약, 내림차순정렬 해주고 싶으면 반대로 하면된다. 
			 */
			Comparable c1 = (Comparable)obj1;
			Comparable c2 = (Comparable)obj2;
			return c1.compareTo(c2)*-1;
		}
			
		return 0;
	}
}



class DescendingOrder2 implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		/*
		 * 
		 */
		/* obj1과 obj2가 Comparable 타입인지 검사 */
		if(obj1 instanceof String && 
				obj2 instanceof String) {
			/*
			 * 두 대상을 비교해서 앞의 것이 크면 양수값
			 * 같으면 0
			 * 뒤의 값이 크면 음수 값 반환
			 * 요렇게 해주면 Arrays.sort 메소드가 
			 * 오름차순 정렬해준다. 
			 * 만약, 내림차순정렬 해주고 싶으면 반대로 하면된다. 
			 */
			String s1 = (String)obj1;
			String s2 = (String)obj2;
			
			return s1.toUpperCase().compareTo(s2.toUpperCase())*-1;
			
		}
			
		return 0;
	}
}












package ch11;

import java.util.*;

public class HashSetEx5 {

	public static void main(String[] args) {
		Set setA = new HashSet();
		Set setB = new HashSet();
		
		Set setHab = new HashSet();
		Set setCha = new HashSet();
		Set setKyo = new HashSet();
		
		setA.add(1);setA.add(2);setA.add(3);setA.add(4);setA.add(5);
		System.out.println("setA:"+setA);
		setB.add(4);setB.add(5);setB.add(6);setB.add(7);setB.add(8);
		System.out.println("setB:"+setB);
		
		/*
		setA.retainAll(setB);
		System.out.println("교집합:"+setA);
		*/
		// 교집합 구하자. retainAll
		/*
		 * setB의 각 원소에 대해
		 *   setA가 그 원소를 포함하고 있으면
		 *     setKyo에 그 원소를 add
		 */
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp)) {
				setKyo.add(tmp);
			}
		}
		System.out.println("setKyo:"+setKyo);
		
		// 차집합(setA-setB) removeAll
		/*
		 * setA의 각 원소에 대해
		 *   setB가 그 원소를 포함하고 있지 않으면
		 *     setCha에 그 원소를 add
		 */
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setB.contains(tmp) == false) {
				setCha.add(tmp);
			}
		}
		System.out.println("setCha:"+setCha);
		
		// 합집합  addAll
		// setA의 각 원소를 setHab에 add
		// setB의 각 원소를 setHab에 add
		it = setA.iterator();
		while(it.hasNext()) setHab.add(it.next());
		it = setB.iterator();
		while(it.hasNext()) setHab.add(it.next());
		System.out.println("setHab:"+setHab);
		
	}

}

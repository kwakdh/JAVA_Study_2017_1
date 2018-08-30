package ch11;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};
		/*
		 * 배열의 내용을 문자열로 출력 
		 */
		System.out.println(Arrays.toString(arr));
		/* Arrays.toString */
		System.out.println(Arrays.deepToString(arr2D));
		
		// Arrays.copyOf
		// Arrays.copyRangeOf
		
		int[] arr7 = new int[5];
		
		Arrays.fill(arr7, 9);
		System.out.println("arr7:"+Arrays.toString(arr7));
		Arrays.setAll(arr7, i->(int)(Math.random()*6)+1);
		System.out.println("arr7:"+Arrays.toString(arr7));
		// [2, 3, 5, 6, 1]
		// **2
		// ***3
		// *****5
		// ******6
		// *1
		// for (int k = 0; k < arr7.length; k++) {
		//		int i = arr7[k]; 
		//	}
		for(int i : arr7) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i);
		}
		// Arrays.equals, Arrays.deepEquals
		String[][] str2D = new String[][]{{"aaa", "bbb"}, 
						{"AAA", "BBB"}};
		String[][] str2D2 = new String[][]{{"aaa", "bbb"}, 
							{"AAA", "BBB"}};				
		System.out.println(str2D==str2D2);
		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		/* Arrays.binarySearch, Arrays.sort */
		
		char[] chArr = {'A', 'D', 'C', 'B', 'E'};
		System.out.println("charArr="+Arrays.toString(chArr));
		int idx = Arrays.binarySearch(chArr, 'B');
		System.out.println("idx:"+idx);
		
		Arrays.sort(chArr);
		System.out.println("charArr="+Arrays.toString(chArr));
		idx = Arrays.binarySearch(chArr, 'B');
		System.out.println("idx:"+idx);
	}
}









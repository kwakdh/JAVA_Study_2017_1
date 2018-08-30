	package ch12;
	
	import java.util.*;
	
	public class Statistics {
		
		public static <T> void printList(List<T> slist) {
			System.out.println(slist);
		}
		
		public static void dummy(Person p ) {
			System.out.println(p);
		}
		
		public static void getPGenderStat(List<? super Student> list) {
			
		}
		
		public static <T extends Student & Comparable<Student>> void dummy2(T p ) {
			System.out.println(p);
		}
		
		/*
		public static void getPGenderStat(List<Person> plist) {
			TreeMap<Integer, Integer> gmap = new TreeMap<>();
			Iterator<Person> it = plist.iterator();
			while(it.hasNext()) {
				Person p = it.next();
				int gender = p.getGender();
				Integer value = gmap.get(gender);
				if(value == null) {
					gmap.put(gender,  1);
				}else {
					gmap.put(gender,  value+1);
				}
			}
			
			printMap(gmap);
		}
		*/
		/*
		public static <T extends Person> void getGenderStat(List<T> plist) {
			TreeMap<Integer, Integer> gmap = new TreeMap<>();
			Iterator<T> it = plist.iterator();
			while(it.hasNext()) {
				Person p = it.next();
				int gender = p.getGender();
				Integer value = gmap.get(gender);
				if(value == null) {
					gmap.put(gender,  1);
				}else {
					gmap.put(gender,  value+1);
				}
			}
			
			printMap(gmap);
		}
		*/
		/* 과제:
		 *   Student 객체의 List 또는 GradStudent 객체의 List를
		 *   입력으로 받아서
		 *   총점, 평균, 최고점수 학생정보, 최저점수 학생정보를
		 *   출력하는
		 *   Generic Method를 구현하라.  
		 */
		
		public static void getGenderStat(List<? extends Person> plist) {
			TreeMap<Integer, Integer> gmap = new TreeMap<>();
			Iterator<? extends Person> it = plist.iterator();
			while(it.hasNext()) {
				Person p = it.next();
				int gender = p.getGender();
				Integer value = gmap.get(gender);
				if(value == null) {
					gmap.put(gender,  1);
				}else {
					gmap.put(gender,  value+1);
				}
			}
			
			printMap(gmap);
		}	
		
		public static void printMap(Map<Integer, Integer> map) {
			Set<Integer> keySet = map.keySet();
			Iterator<Integer> it = keySet.iterator();
			while(it.hasNext()) {
				Integer key = it.next();
				if (key==Person.MALE) {
					System.out.println("남자:" + map.get(key));
				} else if (key == Person.FEMALE) {
					System.out.println("여자:" + map.get(key));
				}else {
					System.out.println("불분명:" + map.get(key));
				}
			}
		}
		
		public static <T extends Student> void prtInfo (List<T> list) {
			int		sum = 0;
			int		min = Integer.MAX_VALUE;
			int		max = Integer.MIN_VALUE;
			
			Iterator<T> it = list.iterator();
			
			while (it.hasNext()) {
				Student value = it.next();
				
				int Sscore = value.getScore();
				sum += Sscore;
				
				if (max < Sscore) {
					max = Sscore;
				}
				if (min > Sscore) {
					min = Sscore;
				}
			}
			
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + (float)sum/list.size());
			
			Iterator<T> it2 = list.iterator();
			
			while(it2.hasNext()) {
				Student value2 = it2.next();
				int temp = value2.getScore();
				
				if (temp == max) {
					System.out.println("최고점수 학생");
					System.out.println(value2);
				}
				if (temp == min) {
					System.out.println("최저점수 학생");
					System.out.println(value2);
				}
			}
			
		}
		
		
		public static void sort(List<? extends Student> list){
			Collections.sort(list);
		}
		
		public static <T extends Student> void descendingSort(List<T> list) {
			//Collections.sort(list);
			//Collections.sort(list, /* Comparator 인터페이스를 구현한 객체 */);
			Collections.sort(list, new StudentDescOrder<T>());
		}
		
		public static <T extends Comparable<? super T>> void sortReverse(List<T> list) {
			Collections.sort(list,  new ReverseComparator<T>());
		}
		
		
		
		
		
		
	}

package ch12;

import java.util.ArrayList;

public class GenericTest {
	public static void main(String[] args) {
		/*
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(1);
		
		int num = list.get(0);
		
		//ArrayList<Object> list2 =new ArrayList<String>();
		ArrayList<Object> list2 =new ArrayList<Object>();
		list2.add("abc");
		list2.add(3);
		*/
		
		ArrayList<Person> pList = new ArrayList<Person>();
		pList.add(new Person("홍길동", 17, Person.MALE));
		pList.add(new Person("일지매", 32, Person.MALE));
		pList.add(new Person("성춘향", 18, Person.FEMALE));
		pList.add(new Person("이몽룡", 20, Person.MALE));
		pList.add(new Person("향단이", 17, Person.FEMALE));
		//pList.add(new Student("향단이", 17, Person.FEMALE, "컴정", 100));
		//Statistics.getGenderStat(pList);
		/*
		Container<Person> c1 = new Container<Person>();
		c1.setList(pList);
		System.out.println(c1);
		*/
		
	//	Statistics.dummy(new Person("홍길동", 17, Person.MALE));
		//Statistics.dummy(new Student("이세혁", 20, Person.MALE, "컴정", 88));
		//Statistics.dummy2(new Student("이세혁", 20, Person.MALE, "컴정", 88));
		ArrayList<Student> sList = new ArrayList<Student>();
		sList.add(new Student("이세혁", 20, Person.MALE, "컴정", 88));
		sList.add(new Student("박병옥", 20, Person.MALE, "컴정", 68));
		sList.add(new Student("강상운", 20, Person.MALE, "컴정", 78));
		sList.add(new Student("황금비", 20, Person.FEMALE, "컴정", 99));
		sList.add(new Student("최선주", 20, Person.FEMALE, "컴정", 98));
		Container<Student> c2 = new Container<Student>();
		/*
		c2.setList(sList);
		System.out.println(c2);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Container.sayHello(new SalesMan("박성철", Person.MALE, 30, 100));
		Statistics.getGenderStat(sList);
		*/
		//Statistics.sort(sList);
		Statistics.descendingSort(sList);
		System.out.println(sList);
		//Statistics.getPGenderStat(sList);
		/*
		ArrayList<SalesMan> smList = new ArrayList<SalesMan>();
		smList.add(new SalesMan("이성민", 23, Person.MALE, 300));
		smList.add(new SalesMan("이아름", 23, Person.FEMALE, 400));
		smList.add(new SalesMan("이효진", 23, Person.FEMALE, 250));
		smList.add(new SalesMan("진성규", 23, Person.MALE, 310));
		smList.add(new SalesMan("강성은", 23, Person.FEMALE, 280));
		*/
		/*
		Container<SalesMan> c3 = new Container<SalesMan>();
		c3.setList(smList);
		System.out.println(c3);
		*/
		/*
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		Statistics.printList(strList);
		
		//Statistics.<SalesMan>printList(smList);
		Statistics.printList(smList); */
		
		//Statistics.prtInfo(sList);
		
	}
}










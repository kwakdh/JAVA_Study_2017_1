package ch12;

import java.util.ArrayList;

public class GenericTest2 {
	public static void main(String[] args) {
		/*
		ArrayList<GradStudent> sList = new ArrayList<GradStudent>();
		sList.add(new GradStudent("이세혁", 20, Person.MALE, "컴정", 88, Major.COMPUTER));
		sList.add(new GradStudent("박병옥", 20, Person.MALE, "컴정", 68, Major.COMPUTER));
		sList.add(new GradStudent("강상운", 20, Person.MALE, "기계", 78, Major.MECHANICS));
		sList.add(new GradStudent("황금비", 20, Person.FEMALE, "전기", 99, Major.ELECTRICITY));
		sList.add(new GradStudent("최선주", 20, Person.FEMALE, "컴정", 98, Major.COMPUTER));
		
		Statistics.descendingSort(sList);
		System.out.println(sList);
		*/
		
		/*
		ArrayList<Fruit> flist = new ArrayList<Fruit>();
		flist.add(new Fruit());
		flist.add(new Fruit());
		flist.add(new Fruit());
		flist.add(new Fruit());
		flist.add(new Fruit());
		System.out.println(flist);
		Statistics.sortReverse(flist);
		System.out.println("After Sort");
		System.out.println(flist);
		*/
		
		ArrayList<Apple> alist = new ArrayList<Apple>();
		alist.add(new Apple());
		alist.add(new Apple());
		alist.add(new Apple());
		alist.add(new Apple());
		alist.add(new Apple());
		
		System.out.println(alist);
		System.out.println("After Sort");
		Statistics.sortReverse(alist);
		System.out.println(alist);
	}

}

package ch12;

import java.util.ArrayList;

public class BoxStudent {
	private ArrayList<Student> list 
				= new ArrayList<>();
	
	public void add(Student item) {
		list.add(item);
	}
	public Student get(int index) {
		return list.get(index);
	}
	public String toString() {
		return list.toString();
	}
}

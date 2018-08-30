package ch12;

import java.util.*;

public class Box<T> {
	private ArrayList<T> list = new ArrayList<>();
	
	public void add(T item) {
		list.add(item);
	}
	public /*static*/ void setItem(T item) {
		 
	}
	public T get(int index) {
		return list.get(index);
	}
	public String toString() {
		return list.toString();
	}
}

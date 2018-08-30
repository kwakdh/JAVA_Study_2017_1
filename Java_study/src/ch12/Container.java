package ch12;

import java.util.List;

public class Container<T extends Student> {
	private List<T> list;
	
	// private static  T item;
	T[] itemArr = null;

	
	public void  setList(List<T> list) {
		this.list = list;
		//itemArr = new T[];
		String s;
		//if (s instanceof T) {}
	}
	
	public String toString() {
		return list.toString();
	}
	
	public static <K> void sayHello(K v) {
		System.out.println("Hello" + v);
	}

}





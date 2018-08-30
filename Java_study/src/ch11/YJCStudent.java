package ch11;

import java.util.*;

public class YJCStudent implements Comparable{
	int age;
	int score;
	String name;
	
	public YJCStudent(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String toString() {
		return "name:"+name+", age:"+age+", score:"+score;
	}

	public static void main(String[] args) {
		YJCStudent[] stds = {
				new YJCStudent("Hong", 20, 87),
				new YJCStudent("Kong", 18, 97), 
				new YJCStudent("Park", 22, 86), 
				new YJCStudent("Kim", 21, 98), 
				new YJCStudent("Lee", 19, 100)
		};
		
		Arrays.sort(stds);
		for(YJCStudent s : stds)
			System.out.println(s);	
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof YJCStudent) {
			YJCStudent s = (YJCStudent)o;
			return this.score-s.score;
		}
		return -1;
	}
}

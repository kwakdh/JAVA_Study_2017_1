package ch11;

import java.util.*;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		
		System.out.println("range search: from["+from+"] to["+to+"]");
		Set subset = set.subSet(from, to);
		System.out.println(subset);
		subset = set.subSet(from, to+"z");
		System.out.println(subset);
	}

}

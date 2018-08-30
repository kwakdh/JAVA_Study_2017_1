package ch12;

import java.util.Comparator;

public class StudentDescOrder<T extends Student> implements Comparator<T> {

	@Override
	public int compare(T std1, T std2) {
		// TODO Auto-generated method stub
		return std1.compareTo(std2)*-1;
	}

}

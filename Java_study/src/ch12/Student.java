package ch12;

public class Student extends Person implements Comparable<Student> {
	private String dept;
	private int score;
	
	public String toString() {
		return super.toString()+", dept:"+dept+", score:"+score;
	}
	public Student(String name, int age, int gender, String dept, int score) {
		super(name, age, gender);
		this.dept = dept;
		this.score = score;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return this.score-arg0.score;
	}
}

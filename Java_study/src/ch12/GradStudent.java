package ch12;

public class GradStudent extends Student {
	private Major major;
	public GradStudent(String name, int age, int gender, String dept, int score, Major major) {
		super(name, age, gender, dept, score);
		this.major = major;
	}
	public String toString() {
		return super.toString()+", major:"+major;
	}

}

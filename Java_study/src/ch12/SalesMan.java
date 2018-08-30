package ch12;

public class SalesMan extends Person {
	private int salary;
	public SalesMan(String name, int age, int gender, int salary) {
		super(name, age, gender);
		this.salary = salary;
	}
	public String toString() {
		return super.toString()+", salary:"+salary;
	}



}

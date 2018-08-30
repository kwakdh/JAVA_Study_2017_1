package ch12;

public class Person {
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	public static final int UNKNOWN = 2;
	
	private String name;
	private int age;
	private int gender;
	
	public String toString() {
		return "name:"+name+", age:"+age+", gender"+
				(gender==MALE?"남":(gender==FEMALE?"여":"모름"));
	}
	
	public Person (String name, int age, int gender) {
		this.name = name;
		this.age = age;
		if(gender != MALE && gender != FEMALE)
			gender = UNKNOWN;
		else 
			this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	
}

package ch12;

public class Fruit implements Comparable<Fruit> {
	private static int idx = 0;
	protected int num;
	public Fruit() {
		num = idx++;
	}
	public String toString() {
		return "Fruit"+num;
	}
	
	public int compareTo(Fruit f) {
		return this.num - f.num;
	}

}

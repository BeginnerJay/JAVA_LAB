package chapter11;

public class SWeight {
	String name;
	double weight, height, SW;
	final double BASE = 100, PERCENT = 0.9;
	
	SWeight(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	
	void check_SWeight() {
		SW = (height - BASE) * PERCENT;
	}
	
	void display() {
		check_SWeight();
		System.out.println("����ü�� : " + SW);
		if (weight < SW - 5) {
			System.out.println("��ü��");
		} else {
			if (weight > SW + 5) {
				System.out.println("��ü��");
			} else {
				System.out.println("����ü��");
			}
		}
	}
}
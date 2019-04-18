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
		System.out.println("정상체중 : " + SW);
		if (weight < SW - 5) {
			System.out.println("저체중");
		} else {
			if (weight > SW + 5) {
				System.out.println("과체중");
			} else {
				System.out.println("정상체중");
			}
		}
	}
}

package chapter11;

public class HWTest {

	public static void main(String[] args) {
		double weight, height;
		double standardWeight;
		final double BASE = 110, PERCENT = 0.9;
		weight = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("������ �Է�"));
		height = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Ű �Է�"));
		
		standardWeight = (height - BASE)*PERCENT;
		
		if (weight < standardWeight - 5) {
			System.out.println("��ü��");
		} else {
			if (weight > standardWeight + 5) {
				System.out.println("��ü��");
			} else {
				System.out.println("����ü��");
			}
		}
	}

}

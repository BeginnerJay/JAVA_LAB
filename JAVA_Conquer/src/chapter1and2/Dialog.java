package chapter1and2;

public class Dialog {

	public static void main(String[] args) {
		// ��ĳ�ʸ� ���� ����� ��ƴٸ� �׷��� ���̺귯���� ������ ��ȭ���� ��뵵 ���� 
		String �̸� = javax.swing.JOptionPane.showInputDialog("�̸��� �Է��Ͻÿ�");
		System.out.println("�ȳ��ϼ��� " +�̸�+ "��.");
		
		String ����â = javax.swing.JOptionPane.showInputDialog("���̸� �Է��Ͻÿ�");
		int ���� = Integer.parseInt(����â);
		System.out.println("����� " +����+ "���Դϴ�.");
	}

}

package chapter1and2;

public class Scanner {
// �⺻ �Է� ��ü�� System.in�� �����ϴ� Scanner �������� �˾ƺ���
	public static void main(String[] args) {
		//���� ���ؿ����� main�� ���ο� �������� ������ ������ �ۼ����ָ� �ȴ�.
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		/*
		 * nextInt() ���� �Է�
		 * nextDouble() �Ǽ� �Է�
		 * nextLine() ���ڿ� �Է�
		 * nextBoolean() true, false �� �Է�
		 */
		// �Է� �޼���� �Է¸� ���� �� ���� ������ �������� �����Ƿ�, �Է¹ޱ� ���� print �޼���� �˷�����
		System.out.print("�̸��� �Է��Ͻÿ� :"); //�̸� �Է� ������
		String �̸� = scanner.nextLine();
		System.out.println("�ȳ��ϼ��� " +�̸�+ "��.");
		
		System.out.println("���̸� �Է��Ͻÿ� :"); // ���� �Է� �ؿ���
		int ���� = scanner.nextInt();
		System.out.println("����� " +����+ "���Դϴ�.");
		//���� ���ؿ����� main�� ���ο� �������� ������ ������ �ۼ����ָ� �ȴ�.
		scanner.close();
	}

}

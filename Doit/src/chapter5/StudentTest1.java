package chapter5;
// �ν��Ͻ� ���� �� �����ϱ�
public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student( ); // ù ��° �ν��Ͻ�(�л�) ����
		// Student Ŭ���� �ڷ������� student1 ������ �����ϰ�,
		// new Student();�� Student Ŭ������ �����Ͽ�(�ν��Ͻ� ����) student1�� �����Ѵٴ� ��
		//student1.studentName = "�ȿ���"; // student1 ���� ������ studentName ��� ������ �̸� ����.
		student1.setStudentName("�ȿ���");
		System.out.println(student1.getStudentName()); // �޼��� ���
		
		Student student2 = new Student(); // �� ��° �ν��Ͻ� ����
		// Student Ŭ���� �ڷ������� student2 ���� ����.
		// new Student();�� Student Ŭ���� ���� -> student2�� ����
		//student2.studentName = "�Ƚ¿�";
		student2.setStudentName("�Ƚ¿�");
		System.out.println(student2.getStudentName());
	}

}
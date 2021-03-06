package chapter5;
// 인스턴스 여러 개 생성하기
public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student( ); // 첫 번째 인스턴스(학생) 생성
		// Student 클래스 자료형으로 student1 변수를 선언하고,
		// new Student();로 Student 클래스를 생성하여(인스턴스 생성) student1에 대입한다는 뜻
		//student1.studentName = "안연수"; // student1 참조 변수로 studentName 멤버 변수에 이름 저장.
		student1.setStudentName("안연수");
		System.out.println(student1.getStudentName()); // 메서드 사용
		
		Student student2 = new Student(); // 두 번째 인스턴스 생성
		// Student 클래스 자료형으로 student2 변수 선언.
		// new Student();로 Student 클래스 생성 -> student2에 대입
		//student2.studentName = "안승연";
		student2.setStudentName("안승연");
		System.out.println(student2.getStudentName());
	}

}

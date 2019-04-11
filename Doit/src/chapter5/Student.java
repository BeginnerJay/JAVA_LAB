package chapter5;
// class는 클래스를 만드는 예약어, Student는 클래스 이름
public class Student {
	int studentID; // 학번
	private String studentName; // 학생 이름. private로 선언하면 결과 값이 어떻게 바뀌는지 알아보자.
	int grade; // 학년
	String address; // 사는 곳
	// 멤버 변수 4개 선언(멤버 변수는 속성, 특성 등이라는 말로 표현하기도 함)

	public void showStudentsInfo( ) {
		System.out.println(studentName + "," + address); // 이름, 주소 출력
	}

	public String getStudentName( ) {
		return studentName; // 학생의 이름을 반환하는 메서드. 개발자가 만든 멤버 변수를 반환하라고 시킬 수 있음
	} // private 변수인 studentName에 접근해 값을 가져오는 public get() 메서드

	public void setStudentName(String name) {
		studentName = name;// 학생 이름을 매개변수로 전달
	} // private 변수인 studentName에 접근해 값을 지정하는 public set() 메서드

// Student 클래스에 main() 함수 추가하기

	public static void main(String[] args) {
		Student studentAhn = new Student( ); // new로 Student 클래스 생성
		studentAhn.studentName = "안연수"; // 클래스의 멤버 변수에 값을 대입하는 코드

		System.out.println(studentAhn.studentName); // 학생 이름 직접 찾음
		System.out.println(studentAhn.getStudentName( )); // 메서드로 학생 이름 확인
	}
}
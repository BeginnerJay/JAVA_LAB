package chapter6;

public class StudentTest2 {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지은");
		System.out.println(Student1.serialNum);
		System.out.println(studentLee.studentName+" 학번 : "+
				studentLee.studentID);
		// 마찬가지로 The static field Student.serialNum should be accessed in a static way 경고가 출력된다.
		// 결과는 원하는 대로 출력되었다.
		// 이는 객체의 static 변수는 객체 리퍼런스에 점을 붙여서
		// ex) studentLee.serialNum
		// 접근하는 기존 방식이 아닌
		// 클래스에 점을 붙여서 사용하는 방식을 사용하라는 뜻!
		// 하지만 결과는 의도한 대로 출력된다.

		Student1 studentSon = new Student1();
		studentSon.setStudentName("손흥민");
		System.out.println(Student1.serialNum);
		System.out.println(studentSon.studentName+" 학번 : "+
				studentSon.studentID);
	}
}
/*
 * 학생 인스턴스를 생성할 때마다 serialNum 변수 값 증가.
 * 새로 생성되는 학생마다 studentID 변수에 serialNum 값 복사.
 * -> 두 학생의 학번이 다르게 저장되었다.
 *
 * static 변수는 같은 클래스에서 생성된 인스턴스들이 같은 값 공유
 * -> 인스턴스 간에 공통으로 사용할 값이 필요한 경우 유용
 */

// 객체를 생성하지 않고도 자바 static 변수는 접근이 가능하다.
// 상수나 글로벌 변수 등이 필요할 때 쓰면 편리하다.
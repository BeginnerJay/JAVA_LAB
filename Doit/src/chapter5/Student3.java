package chapter5;
// 학생 클래스 만들기. 과목에 대한 정보는 과목 클래스에서 가져온다
public class Student3 {
	int studentID;
	String studentName;
	Subject korean = new Subject(); // 과목 클래스에서 만든 Subject 자료형(참조 자료형)을 이용한 변수 선언

	Subject math;

}

// 6.2 객체 간 협력
// 6.3 static 변수(각 인스턴스가 모두 공유하는 변수)
// 학생 클래스 구현하기
// 학생 클래스는 이름, 학년, 가진 돈을 member variable(attribute)로 가진다.
// 그리고 버스를 탄다, 지하철을 탄다. 학생의 현재 정보를 보여준다를 method(member function)으로 가진다.
package chapter6;

public class Student {
	public static int serialNum = 1000; // static 변수는 인스턴스 생성과 상관 없이 먼저 생성됨
	public int studentID;
	public String studentName; // 학생 이름
	public int grade; // 학년
	public int money; // 소지금액
	public String address;

	public String getStudentName() { // getter method
		return studentName;
	}

	public void setStudentName(String name) { // setter method
		this.studentName = name;
	}

	public Student(String studentName, int money) { // 학생 이름과 돈을 parameter로 받는 constructor
		this.studentName = studentName;
		this.money = money;
	}

	public Student( ) {} // default constructor 직접 추가하기

	public void takeBus(Bus bus) { // 버스 클래스는 따로 구현되어, 버스 클래스와 협력한다.
		bus.take(1000); // 학생이 버스를 타면 1000원 지불하는 메서드
		this.money -= 1000;
	}

	public void takeSubway(Subway subway) {
		subway.take(1500); // 학생이 지하철 타면 1500원 지불하는 메서드
		this.money -=1500;
	}

	public void takeTaxi(Taxi taxi) {
		taxi.take(10000); // 학생이 택시 타면 10000원 지불하는 메서드
		this.money -=10000;
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
}

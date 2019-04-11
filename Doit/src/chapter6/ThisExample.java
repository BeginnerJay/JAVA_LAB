// this 출력하기
// this는 간단히 설명하면 생성된 인스턴스 스스로를 가리키는 예약어이다.
package chapter6;

class BirthDay {
	int day, month, year;

	public void setYear(int year) { // 태어난 연도를 지정하는 메섣,
		this.year = year; // bDay.year = year;와 같은 기능
	}
	public void printThis() { // this 출력 메서드
		System.out.println(this); // sysout(bDay)와 같은 기능
	}
}

public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(1994); // 태어난 년도를 1994년으로 지정
		System.out.println(bDay); // 참조값 출력
		bDay.printThis(); // this 출력 메서드 호출
	}
}

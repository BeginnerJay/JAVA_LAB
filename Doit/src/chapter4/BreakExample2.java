package chapter4;

public class BreakExample2 {

	public static void main(String[] args) {
		int sum = 0, num = 0;
		for (num = 0; ; num++) { // 조건식을 생략하는 대신 break문을 사용한다.
			sum += num;
			if (sum >= 100) { // sum이 100보다 크거나 같을 때 종료
				break; // 반복문 중단 명령어
			}
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}
}
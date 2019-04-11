package chapter5;

/*
 * 정답보다는 문제를 푸는 과정을 익혀야 한다.
 */

public class Leibniz1 {
	public static void main(String[] args) {
		double pie = 0;
		boolean plus = true;
		for (int deno = 1; deno < 1000; deno +=2) {
			if (plus == true) {
				pie = pie + 1.0/deno;
				plus = false;
			} else {
				pie = pie - 1.0/deno;
				plus = true;
			}
		}
		pie *= 4;
		System.out.println("pie = " + pie);
		// 증감을 조건문으로 구분하는 것은 비효율적!
		pie = 0; int sign = 1;
		for (int deno = 1; deno < 1000; deno+=2) {
			pie = pie + (1.0/deno)*sign;
			sign = -sign;
		}
		pie *=4;
		System.out.println("pie = " + pie);
		
		pie = 0;
		for (int deno = 1; deno < 1000; deno+=4) {
			pie = pie + (1.0/deno - 1.0/(deno + 2));
		}
		System.out.println("pie = " + pie*4);
	}
}

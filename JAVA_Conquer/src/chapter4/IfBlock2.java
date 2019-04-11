package chapter4;

public class IfBlock2 {
	public static void main(String[] args) {

        int age = 15;

       

        if (age >= 19)

            System.out.println("성인입니다.");

            System.out.println("술집 입장.");

   }
}
/*
 * age의 초기값을 15로 변경하고 if문의 블록을 제거했다. 
 * 조건이 거짓이니 아무것도 출력되지 않아야 하지만 
 * 실행해 보면 뒤쪽 메시지가 출력된다. 
 * if 조건문은 "성인입니다" 출력문에서 이미 끝났으며 
 * 술집 입장문은 조건과 상관없는 독립적인 명령이다. 
 * 들여 쓰기를 해서 두 명령이 한 묶음인 것처럼 보이지만.
*/

// 명령 개수에 상관없이 무조건 블록을 감싸는 버릇을 들이자.
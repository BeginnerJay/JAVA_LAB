package chapter4;

public class StarPyramid 
{
	public static void main(String[] args) {
		int lineCount = 4; // 총 네줄
		int spaceCount = 3; // 1씩 줄어듬
		final int spaceCount2 = 3;
		int starCount = 0; // 실제로 별 찍는 카운트
		int starCount2 = 0; // 별 카운트를 수열 만들어주는 카운트
		
		
		for (int i = 0; i < lineCount; i++) { //총 네줄 반복
			for (int j = spaceCount; j > 0; j--) {
				System.out.print(" ");
			} // 세개에서 하나씩 줄어들게 하는 반복문
			spaceCount--;
			starCount = (2 * starCount2) + 1; // 별 갯수 만드는 명령
			starCount2++;
			for (int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			System.out.println(); // 직접만든것
		}
		
		for (int i = 0; i < lineCount; i++) {
			
			for (int j = 0; j < spaceCount2 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
		System.out.println(); // 모범답안 1 
		}
		
		int lineCount3 = 4;  
		int spaceCount3 = lineCount3/2 +1;
		int starCount3 = 1;
		
		for(int i = 0; i<lineCount3; i++) {
			for(int j = 0; j<spaceCount3; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount3; j++) {
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount3; j++) {
				System.out.print(' ');
			}
			
			spaceCount3-=1;
			starCount3+=2;
			System.out.println();
			// 셋쩨 for 반복문은 쓸모 없어 보일지도 모르지만, 후에 다이아몬드 만들어 볼 때 아이디어에 도움이 된다.
		}
	}
}


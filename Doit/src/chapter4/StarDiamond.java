package chapter4;

public class StarDiamond {

	public static void main(String[] args) {
		
		int lineCount = 7;  
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		System.out.println(spaceCount); // int 자료형이라 소수점 버린다
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			
			if (i < lineCount/2) { // 홀수면 n/2-.5까지는 별증가공백감소
				starCount += 2;// starCount = starCount + 2 하면 계차수열된다
				spaceCount--;
			} else {
				starCount -= 2;
				spaceCount++;
			}
			System.out.println();
		}
	}
}

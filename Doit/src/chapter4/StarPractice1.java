package chapter4;

public class StarPractice1 {

	public static void main(String[] args) {
		int lineCount = 3;
		int starCount = 4;
		for (int i = 0; i < lineCount; i++) 
		{
			for (int j = 0; j < starCount; j++) 
			{
				System.out.println("*");
				// println 쓰면 자동으로 줄이 바뀐다!!!
			}
			System.out.println("");
		}
		
		for(int i = 0; i < 3; i++) 
		{
			for(int j = 0; j <4; j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}

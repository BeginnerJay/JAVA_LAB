package chapter7;

public class TwoDimension {
    public static void main(String[] args) {
        int[][]arr = { {1, 2, 3}, {4, 5, 6} }; //2차원 배열 선언과 동시에 초기화

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println( ); // 행 출력 끝난 후 한 줄 띄움
        }
    }
}

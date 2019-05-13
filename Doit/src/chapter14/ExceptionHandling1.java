package chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e); // 예외 클래스의 toString() 메서드 출력
        }
        System.out.println("여기도 출력됩니다."); // 프로그램 정상 종료
    }
}

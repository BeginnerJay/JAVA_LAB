package chapter9;

public class Constant {
    int num = 10;
    final int NUM = 100;

    public static void main(String[] args) {
        Constant cons = new Constant();
        cons.num = 50;
        // cons.NUM = 500; // 상수에 값을 대입하여 오류 발생

        System.out.println(cons.NUM);
        System.out.println(cons.num);
    }
}
package chapter05;

public class Sum100 {
	public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++){
             sum = sum + i;
        }
        System.out.println("�հ� = " + sum);
   }
}
/*
 * ����� �ڵ尡 �ݺ��ȴ� ������ �ڵ带 �������� ���� 
 * ��Ģ�� ã�� �ݺ������� �ٲ۴�. 
 * �ڵ忡�� �ݺ��Ǵ� �κ��� ã�� ��ȭ�� �ִ� �κп� 
 * ���� ������ �����Ͽ� ������ �ڵ带 ������ �����ϸ� �ȴ�. 
 * 
 * �ݺ��Ǵ� �κп��� ������ �ڵ尡 �����̰� 
 * ���� ������ ��� ��� ������ ������ �� �����ؾ� �Ѵ�.
 */
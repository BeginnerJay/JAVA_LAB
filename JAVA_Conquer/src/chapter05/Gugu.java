package chapter05;
/*
 * for���� ��Ͽ��� �ݺ��� ��� ����� ���µ� 
 * ����� ������ ������ ����. 
 * for���� ������ ����̹Ƿ� ������ �� �� ������ 
 * �̷��� �Ǹ� �ݺ��� �ݺ��Ǵ� �����̴�. 
 * �ݺ����� ��ø�Ǿ� ��ġ�� ���� ���� ������� �ϴµ� 
 * ���� �������� ���� �������̴�.
 */

/*
 * ���� ������Ʈ������ 3�� ���� �̻� ���� ���ȴ�. 
 * �� �л��� �� ������ ����ϴ� �۾��� 
 * 1�ݿ��� 10�ݱ��� �ݺ��ϸ� 3�� �����̰� 
 * �� ������ 1�г⿡�� 3�г���� �ݺ��ϸ� 4�� ������ �ȴ�. 
 * ���������� 6��, 7�� ������ ���ϰ� ���Ǵµ� 
 * �ƹ��� ��ø�� ���ص� ���� ���� ����� �� �ٸ� ������ ���̴�.
 */
public class Gugu {
	public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1;j <= 9;j++) {
                 System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("");
        }
    }
}

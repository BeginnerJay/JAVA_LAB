package chapter11;

import java.io.*;

public class Encryption {
	public static void main(String[] args) throws Exception {
		String i_fn, o_fn, pwd;
		byte[] in_data = new byte[1000];
		byte[] out_data = new byte[1000];
		java.util.Scanner in_scanner = new java.util.Scanner(System.in);



		System.out.print("���� ���� �Է� : ");
		i_fn = in_scanner.nextLine();
		System.out.println("��ȣ ���� �Է� : ");
		o_fn = in_scanner.nextLine();
		System.out.println("�н����� �Է� : ");
		pwd = in_scanner.nextLine();

		byte[] pwd_b = new byte[pwd.length()];
		pwd_b = pwd.getBytes(); // String -> byte array

		FileInputStream in = new FileInputStream(i_fn);
		FileOutputStream out = new FileOutputStream(o_fn);
		int t_len = 0, len = 0;

		for( ; ; ) {
			len = in.read(in_data);
			if (len == -1) {
				break;
			}
			int i = 0;
			for (byte s : in_data) {
				int j = pwd_b.length;
				out_data[i++] = (byte)(pwd_b[i%j]^s); // XOR ������ �̿��� ��ȣȭ
			}
			out.write(out_data);
		}




















		out.close();
		in.close();
		in_scanner.close();
	}
}
package chapter11;
import java.io.*;
public class FileEncrypt {
	String i_fn, o_fn, pwd;
	byte[] in_data = new byte[1000];
	byte[] out_data = new byte[1000];


	FileEncrypt(String i_fn, String o_fn, String pwd) throws Exception {
		this.i_fn = i_fn;
		this.o_fn = o_fn;
		this.pwd = pwd;
		Encrypt();
	}

	public void Encrypt() throws Exception {
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
				out_data[i++] = (byte)(pwd_b[i%j]^s); // XOR 연산을 이용한 암호화
			}
			out.write(out_data);
		}
	}

}

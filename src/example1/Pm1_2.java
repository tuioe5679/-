package example1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Pm1_2 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0;i<2;i++) {
			bw.write("����ģ�� ��������\n");
		}
		
		bw.close();
	}
}

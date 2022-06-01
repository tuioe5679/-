package example3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Pm3_4 {
	public static void main(String[]args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(bf.readLine());
		StringTokenizer s;
		
		for(int i=0;i<count;i++) {
			s = new StringTokenizer(bf.readLine());
			bw.write(Integer.parseInt(s.nextToken())+Integer.parseInt(s.nextToken())+"\n");
		}
		bw.close();
	}
}

package example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pm2_1 {

	public static void main(String[] args) throws IOException {
		int a,b;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		a = Integer.parseInt(str[0]);
		b = Integer.parseInt(str[1]);
		
		if(a==b) {
			System.out.println("==");
		}
		else if(a<b) {
			System.out.println("<");
		}
		else if(a>b) {
			System.out.println(">");
		}
		
	}
}

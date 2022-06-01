package example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pm2_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		do {
			String str = br.readLine();
			a = Integer.parseInt(str);
		}while(!(a>=0&&a<=100));
		
		if(a>=90) {
			System.out.println("A");
		}
		else if(a>=80&&a<90) {
			System.out.println("B");
		}
		else if(a>=70&&a<80) {
			System.out.println("C");
		}
		else if(a>=60&&a<70) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}

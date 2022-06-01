package example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pm2_7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s[] = br.readLine().split(" ");
		int a[] = new int[3];
		for(int i=0;i<s.length;i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		
		if(a[0]==a[1]&&a[2]==a[1]) {
			 System.out.println(10000 + a[1] * 1000);
		}
		else if(a[0]==a[1]||a[1]==a[2]) {
			 System.out.println(1000 + a[1] * 100);
		}
		else if(a[0]==a[2]) {
			 System.out.println(1000 + a[0] * 100);
		}
		else {
			 Arrays.sort(a);
			 System.out.println(a[2] * 100);
		}
	}
}

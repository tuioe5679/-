package example2;

import java.io.IOException;
import java.util.Scanner;

public class Pm2_6 {

	public static void main(String[] args) throws IOException {
		Scanner stdin = new Scanner(System.in);
		
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		
		int sum = b+c;
		
		if(sum/60>0) {
			a += sum/60;
			sum = sum%60;
			if(a>=24){
				a-=24;
				a += sum/60;
				sum = sum%60;
			}
			System.out.println(a +" "+sum);
			
		} 
		else {
			System.out.println(a +" "+sum);
		}
		
	}

}

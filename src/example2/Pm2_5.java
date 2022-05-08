package example2;

import java.util.Scanner;

public class Pm2_5 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
	
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		
		if(b<45) {
			a--;
			b += 60;
			if(a < 0) {
				a = 23;
			}
			b-=45;
		}
		else {
			b-=45;
		}
		System.out.println(a + " " + b);
	}
}

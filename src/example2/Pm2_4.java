package example2;

import java.util.Scanner;

public class Pm2_4 {

	public static void main(String[] args)  {
		Scanner stdin = new Scanner(System.in);
		int x = stdin.nextInt();
		int y = stdin.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("1");
		}
		else if(x < 0 && y > 0) {
			System.out.println("2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("3");
		}
		else if(x > 0 && y < 0) {
			System.out.println("4");
		}
	}
}

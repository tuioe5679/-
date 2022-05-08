package example3;

import java.util.Scanner;

public class Pm3_7 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b,c;
		
		for(int i=1;i<=a;i++) {
			b = stdin.nextInt();
			c = stdin.nextInt();
			System.out.println("Case #" + i + ": " + (b + c));
		}
	}
}

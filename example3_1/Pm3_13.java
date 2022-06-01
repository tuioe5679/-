package example3_1;

import java.util.Scanner;

public class Pm3_13 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a,b;
		do {
			a = stdin.nextInt();
			b = stdin.nextInt();
			
			System.out.println(a+b);
		}while(stdin.hasNext());
	}

}

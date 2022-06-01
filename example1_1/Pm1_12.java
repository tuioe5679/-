package example1_1;

import java.util.Scanner;

public class Pm1_12 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int A = stdin.nextInt();
		int B = stdin.nextInt();
		int C = stdin.nextInt();
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	}
}

package example3;

import java.util.Scanner;

public class Pm3_9 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		for(int i=0;i< a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

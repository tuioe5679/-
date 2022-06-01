package example3_1;

import java.util.Scanner;

public class Pm3_10 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		for(int i=1;i<=a;i++) {
			for(int k = 0; k<a-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

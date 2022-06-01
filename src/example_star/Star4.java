package example_star;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		for(int i=0;i<a;i++) {
			for(int c=0;c<i;c++) {
				System.out.print(" ");
			}
			for(int j=a;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package example_star;

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=a;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}


package example_star;

import java.util.Scanner;

public class Star7 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		
		for(int i=1;i<=a;i++) {
			for(int j=i;j<a;j++) {
				System.out.print(" ");
			}
			for(int x=0;x<i;x++) {
				System.out.print("*");
			}
			for(int c=1;c<i;c++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=a-1;i>=0;i--) {
			for(int j=i;j<a;j++) {
				System.out.print(" ");
			}
			for(int x=0;x<i;x++) {
				System.out.print("*");
			}
			for(int c=1;c<i;c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

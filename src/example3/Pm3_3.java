package example3;

import java.util.Scanner;

public class Pm3_3 {
	public static void main(String[]args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int sum = 0;
		for(int i=1;i<=a;i++) {
			sum +=i;	
		}
		System.out.println(sum);
	}	
}

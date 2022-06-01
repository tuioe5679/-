package example1_1;

import java.util.Scanner;

public class Pm1_13 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int num1 = stdin.nextInt();
		int num2 = stdin.nextInt();
		
		int sum = num1 * num2; 
		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * ((num2 / 10) % 10));
		System.out.println(num1 * (num2 /100));
		System.out.println(sum);
	}

}

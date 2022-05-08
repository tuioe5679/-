package example3;

import java.util.Scanner;

public class Pm3_1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		
		for(int i=1;i<10;i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}

	}

}

package example2;

import java.util.Scanner;

public class Pm2_3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}

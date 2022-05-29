package example9;

import java.util.Scanner;

public class Pm9_1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		System.out.println(packto(a));
		
	}
	
	static int packto(int a) {
		if(0==a) {
			return 1;
		}
		else {
			return a*packto(a-1);
		}
	}
}

package example3_1;

import java.util.Scanner;

public class Pm3_12 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a,b;
		do {
			a = stdin.nextInt();
			b = stdin.nextInt();
			if(a==0&&b==0) {
				break;
			}
			else {
				System.out.println(a+b);
			}
		
		}while(true);
	}

}

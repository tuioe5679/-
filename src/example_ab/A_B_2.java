package example_ab;

import java.util.Scanner;

public class A_B_2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		for(int i=0;i<a;i++) {
			String s = stdin.next();
			String sb[] = s.split(",");
			int b = Integer.parseInt(sb[0]);
			int c = Integer.parseInt(sb[1]);
			System.out.println(b+c);
		}

	}

}

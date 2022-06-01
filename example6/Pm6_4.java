package example6;

import java.util.Scanner;

public class Pm6_4 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = stdin.nextInt();
		int b = 0;
		String s = "";
		String ss[] = new String[20];
		for(int i=0;i<a;i++) {
			b = stdin.nextInt();
			s = stdin.next();
			ss = s.split("");
			for(int j=0;j<ss.length;j++) {
				for(int x=0;x<b;x++) {
					System.out.print(ss[j]);
				}
			}
			System.out.println();
		}
	}
}

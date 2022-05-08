package example4;

import java.util.Scanner;

public class Pm4_3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int[] num = new int[10];
		int a,b,c,d;
		a = stdin.nextInt();
		b = stdin.nextInt();
		c = stdin.nextInt();
		d = a*b*c;
		
		String str = String.valueOf(d);
		String[] ss = str.split("");
		
		for(int i=0;i<ss.length;i++) {
			num[Integer.parseInt(ss[i])]++;		
		}
		for(int i =0;i<10;i++) {
			System.out.println(num[i]);
		}
	}
}

package example6;

import java.util.Scanner;

public class Pm6_3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int num[] = new int[26];
		String s = stdin.next();
		
		for(int i=0;i<num.length;i++) {
			num[i] = -1;
		}
		
		for(int i=0;i<s.length();i++) {
			if(num[s.charAt(i)-97] == -1) {
				num[s.charAt(i)-97] = i;
			}
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i] + " ");
		}
	}
}

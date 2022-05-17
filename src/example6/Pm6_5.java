package example6;

import java.util.Scanner;

public class Pm6_5 {
	public static void main(String[]args) {
		Scanner stdin = new Scanner(System.in);
		int max = 0;
		int count = 0;
		int nums = 0;
		int num[] = new int[26];
		String s = stdin.next();
		s = s.toUpperCase();
		for(int i=0;i<s.length();i++) {
			num[s.charAt(i)-65] ++;
		}
		
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max = num[i];
				nums = i;
			}
		}
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==max) {
				count++;
			}
		}
		if(count>1) {
			System.out.println("?");
		}
		else {
			System.out.println((char)( nums+65));
		}
	}
}

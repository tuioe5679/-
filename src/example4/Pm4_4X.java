package example4;

import java.util.Scanner;

public class Pm4_4X {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int num [] = new int[10];
		int count = 0;
		int scount = 0;
		
		for(int i=0;i<num.length;i++) {
			num[i] = (stdin.nextInt()%42);
		}
		
		for(int i=0;i<num.length;i++) {
			scount=0;
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					scount++;
				}
			}
			if(scount==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}

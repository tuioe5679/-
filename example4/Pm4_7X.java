package example4;

import java.util.Arrays;
import java.util.Scanner;

public class Pm4_7X {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int count = stdin.nextInt();
		int sum [][] = null;
		int sum1[] = new int[count];
		int a = 0,b = 0,cnt=0;
		for(int i=0;i<count;i++) {
			sum1[i] = stdin.nextInt();
			sum = new int[count][sum1[i]];
			
			for(int j=0;j<sum1[i];j++) {
				sum[i][j] = stdin.nextInt();
			}
		}
		for(int i=0;i<count;i++) {
			for(int j=0;j<sum1[i];j++) {
				a += sum[i][j];
			}
			b = a/sum1[i];
			a=0;
			for(int k=0;k<sum1[i];k++) {
				if(b<sum[i][k]) {
					cnt++;
				}
			}
			System.out.println(cnt*100/sum1[i]);
		}
		
		
	}
}

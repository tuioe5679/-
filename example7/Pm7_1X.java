package example7;

import java.util.Scanner;

public class Pm7_1X {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a[] = new int[3];
		int sum = 0;
		int sum2 = 0;
		int count = 0;
		
		for(int i=0;i<3;i++) {
			a[i] = stdin.nextInt();
		}
		
		sum = a[0]+a[1];
		
		while(true) {
			sum += a[1];
			sum2 += a[2];
			count++;
			if(sum2>sum) {
				System.out.println(count);
				break;
			}
		}
	}
}

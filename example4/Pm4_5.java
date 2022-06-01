package example4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Pm4_5 {
	public static void main(String[]args) {
		Scanner stdin = new Scanner(System.in);	
		
		int count=stdin.nextInt();
		Double num=0.0;
		Double sum[] = new Double[count];
		for(int i=0;i<count;i++) {
			sum[i] = stdin.nextDouble();
		}
		Arrays.sort(sum,Collections.reverseOrder());
		Double m = sum[0];
		for(int i=0;i<count;i++) {
			num += (sum[i]/m)*100;
		}
		System.out.println(num/count);
	}

}

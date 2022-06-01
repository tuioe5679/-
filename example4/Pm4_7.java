package example4;

import java.util.Scanner;

public class Pm4_7 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int testCount = stdin.nextInt();
		int count = 0;
		
		for(int i=0;i<testCount;i++) {
			count = stdin.nextInt();
			int num[] = new int[count];
			int sum = 0;
			for(int j=0;j<count;j++) {
				num[j] = stdin.nextInt();
				sum += num[j];
			}
			
			double aveValue = sum/count;
			double aveCount = 0.0;
			
			for(int j=0;j<count;j++) {
				if(aveValue<num[j]) {
					aveCount++;
				}
				
			}
			System.out.printf("%.3f",aveCount/count*100);
			System.out.println("%");
		}
	}
}

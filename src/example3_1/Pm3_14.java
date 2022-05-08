package example3_1;

import java.util.Scanner;

public class Pm3_14 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);	
		
		int N = stdin.nextInt(); 
		int num = N;   
		int count = 0;
		
		while(true) {
			if(count !=0 && num == N) { 
				break;
			}
			
			if(num < 10) { 
				num = num *11; 
				count++; 
				continue;
			}
			
			int sum = num / 10 + num % 10;
			num = num % 10 * 10 + sum % 10;
			count++;
		}
		System.out.println(count);
	}

}

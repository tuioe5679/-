package example5;

import java.util.Scanner;

public class Pm5_3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int num = stdin.nextInt();
		
		if(num<100) {
			System.out.println(num);
		}
		else {
			int result = 99;
			
			for(int i=111;i<=num;i++) {
				result += han(i);
			}
			System.out.println(result);
		}
     
	}
	
	static int han(int a) {
		int th = a / 100; 		//100 �ڸ�
		int tw = a % 100 /10; 	//10�� �ڸ� 
		int on = a % 10; 		//1�� �ڸ� 
		
		//���� ���� ���� 
		if(tw*2 == th+on) {
			return 1;
		}
		return 0;
	}
}

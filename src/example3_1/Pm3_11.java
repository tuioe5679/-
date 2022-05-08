package example3_1;

import java.util.Scanner;

public class Pm3_11 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int num = stdin.nextInt();
		int index[] = new int[num];
		int max = stdin.nextInt();
		
		for(int i=0;i<index.length;i++) {
			index[i] = stdin.nextInt();
		}
		
		for(int i=0;i<index.length;i++) {
			if(max>index[i]) {
				System.out.print(index[i]+" ");
			}
		}

	}
}

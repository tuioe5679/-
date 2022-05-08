
package example4;

import java.util.Scanner;

public class Pm4_2 {

	public static void main(String[] args) {
		int index[] = new int[9];
		int count = 0;
		int max = 0;
		int indexs = 0;
		Scanner stdin = new Scanner(System.in);
		for(int i=0;i<index.length;i++) {
			index[i] = stdin.nextInt();
		}
		for(int value : index) {
			count++;
			
			if(value > max) {
				max = value;
				indexs = count;
			}
		}
		System.out.println(max+"\n"+indexs);
	}
}

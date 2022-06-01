package example6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Pm6_6 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String s = stdin.nextLine();
		int count=0;
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens()) {
			st.nextToken();
			count++;
		}
		System.out.println(count);
	}
}

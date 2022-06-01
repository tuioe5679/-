package example5;

public class Pm5_2 {

	public static void main(String[] args) {
		boolean ch[] = new boolean[100001];
		
		for(int i=1;i<10001;i++) {
			if(self(i)<10001) {
				ch[self(i)] = true;
			}
		}
		
		for(int i=1;i<10001;i++) {
			if(ch[i]==false) {
				System.out.println(i);
			}
		}
	}
	
	static int self(int a) {
		int sum = a;
		while(a>0) {
			sum = sum + (a%10);
			a = a/10;
		}
		return sum;
	}

}

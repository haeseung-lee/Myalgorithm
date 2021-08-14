package chap01.basic;

public class Max4 {

	public static void main(String[] args) {
		
		System.out.println(max4(4,10,6,7));
	}
	
	public static int max4(int a, int b, int c, int d) {

		int max = a;
		
		if(b > max) {
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		
		if(d > max) {
			max = d;
		}
		
		return max;
	}
}

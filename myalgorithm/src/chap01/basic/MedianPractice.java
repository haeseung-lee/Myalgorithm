package chap01.basic;

public class MedianPractice {

	public static void main(String[] args) {
		
		System.out.println(med3(9,11,7));
	}
	
	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			} else if(a <= c) {
				return a;
			} else {
				return c;
			}
		} else if(a > c) {
			return a;
		} else if(b > c) {
			return c;
		} else {
			return b;
		}
	}
}

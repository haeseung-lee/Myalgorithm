package chap01_basicAlgorithm.sub01_whatIsAlgorithm;

import java.util.Scanner;

public class Div01_Median {

	public static void main(String[] args) {
		System.out.println("세 수의 중앙값 구하기");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번쨰");
		int a = sc.nextInt();
		System.out.println("두 번쨰");
		int b = sc.nextInt();
		System.out.println("세 번쨰");
		int c = sc.nextInt();
		
		System.out.println("중앙값 : " + med3(a,b,c));
		
		sc.close();
	}
	
	/**
	 * 세 수의 중앙값을 구하는 함수1
	 */
	static int med3(int a, int b, int c) {
		
		if(a >= b) {
			if(b >= c) {
				return b;
			} else if (a <= c) {
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
	
	static int median3(int a, int b, int c) {
		
		if((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
		} else if ((a > b && c < b) || (a < b && c > b)) {
			return b;
		} else {
			return c;
		}
	}
}

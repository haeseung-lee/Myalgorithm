package chap01.basic;

import java.util.Scanner;

public class RightTrianglePrint {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int n = sc.nextInt();
		
//		triangleLB(n);
//		triangleLU(n);
//		triangleRU(n);
		triangleRB(n);
		
	}
	
	/**
	 * 왼쪽 아래가 직각인 이등변 삼각형 출력
	 * @param n 변의 길이
	 */
	public static void triangleLB(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 왼쪽 위가 직각인 이등변 삼각형을 출력
	 * @param n 변의 길이
	 */
	public static void triangleLU(int n) {
		
		for(int i = n; i >= 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 오른쪽 위가 직각인 이등변 삼각형을 출력
	 * @param n 변의 길이
	 */
	public static void triangleRU(int n) {
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = n; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 오른쪽 아래가 직각인 이등변 삼각형을 출력
	 * @param n 변의 길이
	 */
	public static void triangleRB(int n) {
		
		for(int i = n; i > 0; i--) {
			for(int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < n-i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

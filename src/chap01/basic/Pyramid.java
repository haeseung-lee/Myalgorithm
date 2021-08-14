package chap01.basic;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		npira(num);
	}
	
	public static void spira(int n) {
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (i-1)*2 +1; k++) {
				System.out.print("*");
			}
			for(int l = 0; l < n-i; l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void npira(int n) {
	
		for(int i = 1; i <= n; i++) {
			
			for(int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (i-1)*2 +1; k++) {
				System.out.print(i%10);
			}
			for(int l = 0; l < n-i; l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

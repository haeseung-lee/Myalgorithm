package chap01.basic;

import java.util.Scanner;

public class Rectengular {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

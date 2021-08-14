package chap01.basic;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.print("양의 정수를 입력하세요");
			n = sc.nextInt();
		} while(n <= 0);
	
		int length = (int)(Math.log10(n)+1);
		
		System.out.println("그 수는 " + length + "자리입니다.");
	}
}

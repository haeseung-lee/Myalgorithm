package chap01_basicAlgorithm.sub01_whatIsAlgorithm;

import java.util.Scanner;

public class Div02_Judge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수");
		} else if(num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
		sc.close();
	}
}

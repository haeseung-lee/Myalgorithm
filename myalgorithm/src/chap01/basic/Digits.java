package chap01.basic;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.println("입력");
			num = sc.nextInt();
		} while(num < 10 || num > 99);
		
		System.out.println("변수 num 의 값은" + num + "가(이) 되었습니다.");
	}
}

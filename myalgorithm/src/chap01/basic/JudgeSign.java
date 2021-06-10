package chap01.basic;

import java.util.Scanner;

public class JudgeSign {

	//입력한 정숫값이 양수인지 음수인지 0인지 판단
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int i = sc.nextInt();
		
		if(i > 0) {
			System.out.println("이 수는 양수입니다.");
		} else if(i < 0) {
			System.out.println(" 이 수는 음수입니다.");
		} else {
			System.out.println("이 수는 0입니다.");
		}
	}
}

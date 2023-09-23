package chap01_basicAlgorithm.sub02_loop;

import java.util.Scanner;

public class Div03_Digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int no = 0;
		
		System.out.println("2자리 정수를 입력하세요");
		
		do {
		    System.out.println("입력 : ");
		    no = sc.nextInt();
		} while(no < 10 || no > 99);
		
		System.out.println("변수 no : " + no);
		
		sc.close();
	}
}

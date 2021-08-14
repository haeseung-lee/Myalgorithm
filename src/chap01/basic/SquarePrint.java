package chap01.basic;

import java.util.Scanner;

public class SquarePrint {

	public static void main(String[] args) {
		
		System.out.println("사각형을 출력합니다.");
		
		System.out.print( "단 수 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

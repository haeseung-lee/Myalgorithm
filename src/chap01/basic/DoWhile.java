package chap01.basic;

import java.util.Scanner;

public class DoWhile {
	//1부터 양의정수 n까지의 합구하기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1 부터 n까지의 합 구하기");
		
		int n = 0;
		
		do {
			System.out.print("n의 값 : ");
			n = sc.nextInt();
		} while(n<=0);
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + " 입니다.");
		
	}
}

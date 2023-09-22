package chap01_basicAlgorithm.sub02_loop;

import java.util.Scanner;

public class Div02_SumForPos {

	public static void main(String[] args) {
		
	}
	
	static void doWhile() {
		
		System.out.println("1부터 n까지 합 구하기");
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		do {
			System.out.println("n : ");
			num = sc.nextInt();
		} while(num <= 0);
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 까지의 합 : " + sum);
		
		sc.close();
	}
	
	
	/**
	 * b-a 구하는 함수
	 * b가 a보다 작으면 다시 입력
	 */
	static void bMinusA() {
		 
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		do {
			System.out.println("a값 입력 : ");
			a = sc.nextInt();
			System.out.println("b값 입력 : ");
			b = sc.nextInt();
		} while(a > b);
		
		System.out.println(b + " - " + a + " = " + (b - a));
		
		sc.close();
	}
	
	/**
	 * 양의 정수 자릿수 구하기
	 */
	static void pringNumLength() {
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("양의정수 입력 : ");
			num = sc.nextInt();
		} while(num < 0);
		
		String n = Integer.toString(num);
		System.out.println("그 수는  " + n.length() + "자리입니다.");
		
		sc.close();
	}
	
	
}

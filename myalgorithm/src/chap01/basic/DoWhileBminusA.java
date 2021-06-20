package chap01.basic;

import java.util.Scanner;

public class DoWhileBminusA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		
		while(b <= a) {
			System.out.println("a보다 큰값을 입력하세요");
			System.out.println("b의 값 : ");
			b=sc.nextInt();
		}
		
		int minus = b-a;
		System.out.println(b + " - " + a + "는(은) " + minus + "입니다.");
	}
}

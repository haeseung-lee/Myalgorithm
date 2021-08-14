package chap01.basic;

import java.util.Scanner;

public class SumOfBetweenAandB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		
		int a = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요 : ");
		
		int b = sc.nextInt();
		
		System.out.println(a + "과(와) " + b + "사이의 합 : " + sumof(a,b));
		
	}
	
	public static int sumof(int a, int b) {
		
		int sum = 0;
		
		if(a < b) {
			for(int i = a; i < b+1; i++) {
				sum += i;
			}
		}
		
		if(a > b) {
			for(int i = b; i < a+1; i++) {
				sum += i;
			}
		}
		return sum;
	}
}

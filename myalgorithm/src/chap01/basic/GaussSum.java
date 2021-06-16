package chap01.basic;

import java.util.Scanner;

public class GaussSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		long start = System.currentTimeMillis();
		int n = sc.nextInt();
		int sum = 0;
		
		if(n%2 == 0) {
			 int div = n/2;
			 sum = (1+n) * div;
		} else {
			int div = n/2;
			sum = (1+n) * div + (div+1); 
		}
		long end = System.currentTimeMillis();
		System.out.println("1부터 " + n + "까지의 합 : " + sum);
		System.out.println("실행시간" + (end-start)/1000);
	}
}

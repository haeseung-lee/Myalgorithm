package chap01.basic;

import java.util.Scanner;

public class Sumwhile2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int n = sc.nextInt();
		
		String num = "";
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
			if(i < n) {
				num += i + " + ";
			} else {
				num += i + " = " + sum;
			}
		}
		System.out.println(num);
	}
}

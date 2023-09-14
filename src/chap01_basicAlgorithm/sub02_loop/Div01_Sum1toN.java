package chap01_basicAlgorithm.sub02_loop;

import java.util.Scanner;

public class Div01_Sum1toN {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * 1부터 n까지의 합(while loop)
	 */
	static int sumWhile(int a) {
		int sum = 0;
		int i = 1;
		
		while(i <= a) {
			sum += i;
			i++;
		}
		return sum;
	}
	
	/**
	 * 1부터 n까지의 합(for loop)
	 */
	static int sumFor(int a) {
		int sum = 0;
		
		for(int i = 0; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
	
	/**
	 * 7인 경우 1부터 7까지 합
	 */
	static void onlySeven() {
		
		System.out.println("n의 값을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n != 7){
			System.out.println("n의 값이 7이 아닙니다.");
		} else {
			StringBuffer sb = new StringBuffer();
			int sum = 0;
			
			for(int i = 1; i < n+1; i++) {
				sum += i;
				sb.append(i);
				
				if(i < n) {
					sb.append(" + ");
				} else {
					sb.append(" = ");
					sb.append(sum);
				}
			}
			System.out.println(sb.toString());
		}
		sc.close();
	}
	
	
	/**
	 * 가우스 덧셈
	 */
	static void allSum() {
		
		System.out.println("n의 값을 입력하세요");
		Scanner sc =  new Scanner("System");
		
		int n = sc.nextInt();
		int m = n/2;
		int sum = 0;
		
		if(n % 2 == 0) {
			sum = (1+n) * m;
		} else {
			sum = (1+n) * m + (m + 1);
		}
		
		int checkSum = 0;
		for(int i = 1; i < n+1; i++) {
			checkSum += i;
		}
		
		System.out.println(checkSum);
		System.out.println("1부터 " + n + "까지의 합은 : " + sum);
		
		sc.close();
	}
	
	/**
	 * 정수 a,b 를 포함하여 그사이의 모든 정수의 합을 구하여 반환하는 메소드
	 */
	static void sumOfAB(int a, int b) {
		
		int start = a;
		int finish = b;
		
		if(a > b) {
			start = b;
			finish = a;
		}
		
		int sum = 0;
		
		for(int i = start; i < finish+1; i++) {
			sum += i;
		}
		System.out.println("두 수 " + start + "과(와)" + finish + "를 포함한 두 수 사이의 값 : " + sum);
	}
}

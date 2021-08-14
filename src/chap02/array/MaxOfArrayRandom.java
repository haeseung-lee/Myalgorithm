package chap02.array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRandom {

	static int maxOf(int[] a) {
		
		int max = a[0];
				
		for(int i = 1; i < a.length; i++) {
			
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("키의 최대값 구하기");
//		System.out.print("사람 수 : ");
		
//		int num = sc.nextInt();
		int num = 1+random.nextInt(10);
		
		int[] height = new int[num];
		
		System.out.println(num + "명의 키는 아래와 같습니다.");	
		for(int i = 0; i < num; i++) {
			
			height[i] = 150 + random.nextInt(50);
			System.out.println((i+1) + "번 째 사람의 키 : " + height[i]);
		}
		
		System.out.println("최대값은 " + maxOf(height) + "입니다.");
	}
}

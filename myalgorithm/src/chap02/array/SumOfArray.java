package chap02.array;

public class SumOfArray {

	public static int sumOf(int[] a) {
		
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] numArray = {2, 4, 6, 7, -10};
		
		System.out.println("배열의 합은 : " + sumOf(numArray));
	}
}

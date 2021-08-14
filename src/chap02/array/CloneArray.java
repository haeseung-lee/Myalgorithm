package chap02.array;

public class CloneArray {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		
		
		System.out.print("a =");
		for(int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		
		System.out.println();
		
		b[3] = 0;
		b[4] = 100;
		System.out.print("b =");
		for(int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);
		}
	}
}

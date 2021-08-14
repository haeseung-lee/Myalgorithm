package chap02.array;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] b = {1, 9, 2, 4, 7};
		
		int[] a = new int[b.length];
		
		copy(a, b);
		System.out.println();
		rcopy(a, b);
	}
	
	public static void copy(int[] a, int[] b) {
		
		a = b.clone();
		
		for(int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
	}
	
	public static void rcopy(int[] a, int[] b) {
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = b[a.length -i - 1];
			
			System.out.print(a[i] + " ");
		}
	}
	
}

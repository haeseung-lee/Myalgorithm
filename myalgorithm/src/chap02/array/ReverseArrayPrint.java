package chap02.array;

public class ReverseArrayPrint {

	public static void swap(int[] a, int idx1, int idx2) {
		
		System.out.print("a[" + idx1 + "]과(와) a[" + idx2 + "]를 교환합니다.");
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		System.out.println();
	}
	
	public static void reverse(int[] a) {
		
		for(int i = 0; i < a.length / 2; i++) {
			
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
			swap(a, i, a.length-i-1);
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
	public static void main(String[] args) {
		
		int[] numArray = {1, 2, 3, 4, 5, 6, 7};
		
		reverse(numArray);
	}
}

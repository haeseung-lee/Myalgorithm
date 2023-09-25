package chap02_basicDataStructure.sub01_array;

public class Div01_Array {

	public static void main(String[] args) {
		
	}
	
	/**
	 *  배열의 특성
	 */
	public static void Array() {
		
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
	
	/**
	 * 배열의 요솟값을 초기화하며 배열 선언하기
	 */
	public static void intArrayInt() {
		
	    int[] a = {1, 2, 3, 4, 5};
	    
	    for(int i = 0; i < a.length; i++) {
	    	System.out.println("a[" + i + "] = " + a[i]);
	    }
	}
	
	
	/**
	 * 배열 복제 
	 */
	public static void cloneArray() {
		
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();
		
		b[3] = 0;
		
		for(int i = 0; i <a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		for(int i = 0; i <b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		
	}
}

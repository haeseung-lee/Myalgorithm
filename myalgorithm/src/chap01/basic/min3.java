package chap01.basic;

public class min3 {

	public static void main(String[] args) {
		
		System.out.println(min4(800,1200,19,21));
	}
	
	private static int min3(int a, int b, int c) {
		
		int min = a;
		
		if(min > b) {
			min = b;
		}
		
		if(min > c) {
			min = c;
		}
		return min;
	}
	//p19. 연습
	private static int min4(int a, int b, int c, int d) {
		
		int min = a;
		
		if(min > b) {
			min = b;
		}
		
		if(min > c) {
			min = c;
		}
		
		if(min > d) {
			min = d;
		}
		
		return min;
	}
}

package chap01_basicAlgorithm.sub01_whatIsAlgorithm;

public class Div01_Max3 {
    public static void main(String[] args) {
	 
    }
    
    /**
     * 네 개의 최댓값을 구하는 함수
     * @return
     */
    static int max4(int a, int b, int c, int d) {
    	int max = a;
    	
    	if(b > max) {
    		max = b;
    	}
    	if(c > max) {
    		max = c;
    	}
    	if(d > max) {
    		max = d;
    	}
    	
    	return max;
    }
    
    /**
     * 세 값의 최솟값을 구하는 함수
     */
    static int min3(int a, int b, int c) {
    	
    	int min = a;
    	
    	if(b < min) {
    		min = b;
    	}
    	if(c < min) {
    		min = c;
    	}
    	
    	return min;
    }
    
    /**
     * 세 값의 최솟값을 구하는 함수
     */
    static int min4(int a, int b, int c, int d) {
    	
    	int min = a;

    	if(b < min) {
    		min = b;
    	}
    	if(c < min) {
    		min = c;
    	}
    	if(d < min) {
    		min = d;
    	}
    	
    	return min;
    	
    	
    }
}


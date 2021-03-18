package maximumUnitOnTruck;


public class MySolution {

	public static void main(String[] args) {
		// 2차원배열의 트럭이 있다. 트럭에는 상자를 담을 수 있다.int[][] boxTypes;
		// 상자는 2칸짜리 배열이고, 들어있는 것은 다음과 같다 . {i,j} i = 갯수, j = 값 
		// 트럭에는 정수인 truckSize 수만큼 상자를 넣을 수 있다.
		// 상자와 truckSize를 받아 가장 큰값을 구하는 식을 구하라.
		
		
		int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
		int truckSize = 10;
		
		MySolution ms = new MySolution();
		System.out.println(ms.maximumUnits(boxTypes, truckSize));
		
		
	}
	
	public int maximumUnits(int[][] boxTypes, int truckSize) {
		
		int[][] types = boxTypes;
		int size = truckSize;
		int sum = 0;
		
		for(int i=1; i<types.length; i++) {
			for(int j=0; j < i ;j++) {
				if(types[i][1] > types[j][1]) {
					int[] temp = types[i];
					types[i] = types[j];
					types[j] = temp;
				}
			}
		}
		
		for(int i=0; i<types.length; i++) {
			
			if(types[i][0] < size) {
				sum += types[i][0] * types[i][1];
				size -= types[i][0];
			} else {
				sum += size * types[i][1];
				break;
			}
		}
		return sum;
    }
}

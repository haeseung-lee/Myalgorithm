package maximumUnitOnTruck;

import java.util.Arrays;
import java.util.Comparator;

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
		
//		int[][] types = boxTypes;
//		int size = truckSize;
		int sum = 0;
		

		Arrays.sort(boxTypes,(a,b) -> b[1]-a[1]);
		//types[i][1] 내림차순 정렬
//		Arrays.sort(boxTypes, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				
//				return o2[1]-o1[1];
//			}
//		});
		
//		for(int i=1; i<types.length; i++) {
//			for(int j=0; j < i ;j++) {
//				if(types[i][1] > types[j][1]) {
//					int[] temp = types[i];
//					types[i] = types[j];
//					types[j] = temp;
//				}
//			}
//		}

		//합구하기
		for(int i=0; i<boxTypes.length; i++) {
			if(boxTypes[i][0] < truckSize) {
				sum += boxTypes[i][0] * boxTypes[i][1];
				truckSize -= boxTypes[i][0];
			} else {
				sum += truckSize * boxTypes[i][1];
				break;
			}
//			int numOfBox = boxTypes[i][0];
//			int numOfUnit = boxTypes[i][1];
//			sum += (truckSize >= numOfBox ? (numOfBox * numOfUnit) : (numOfUnit * truckSize));
//		truckSize = (truckSize <= numOfBox ? 0 : truckSize - numOfBox );
//		if(truckSize == 0)
//			break;
		}
		return sum;
    }
}

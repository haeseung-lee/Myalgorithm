package minimum_index;

import java.util.ArrayList;
import java.util.Comparator;

public class SumofTwoLists {
	
	
	public String[] findRestaurant(String[] list1, String[] list2) {
		
		// 두개의 리스트에서 일치하는 값을 찾고, 일치하는 값의 list1과 list2의 인덱스를 합하여 가장 작은 값을 반환
		// 같은 값이 있는 경우 list1의 인덱스를 내림차순 정렬하여 출력 
		
		//1. List1과 List2 중 일치하는 것이 있는지 확인
		//일치하는 값의 인덱스 [i(list1), j(list2),i + j 의 합]을 arr에 보관
		//
		ArrayList<int[]> arr = new ArrayList<>();
		
		for(int i = 0; i < list1.length; i++) {
			for(int j = 0; j < list2.length; j++) {
				
				if(list1[i].equals(list2[j])) {
					int[] iarr = new int[3];
					iarr[0] = i;
					iarr[1] = j;
					iarr[2] = i+j;
					
					arr.add(iarr);
				}
			}
		}
		
		//2.인덱스의 합이 작은 순으로 내림차순 정렬
		arr.sort(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] < o2[2]? -1 : 1 ;
			}
		});	
		
		//3. 합이 제일 작은 것들만 arr2에 보관
		ArrayList<int[]> arr2 = new ArrayList<>();
		arr2.add(arr.get(0));
		for(int k=1; k < arr.size(); k++) {
			
			if(arr.get(0)[2] == arr.get(k)[2]) {
				arr2.add(arr.get(k));
			} 
		}
		
		//4. 일치하는 list1의 인덱스 내림차순 정렬
		arr2.sort(new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] < o2[0]? -1 : 1 ;
			}
		});	
		
		//5. String 배열에 담기
		String[] str = new String[arr2.size()];
		for(int m = 0; m < str.length; m++ ) {
			str[m] = list1[arr2.get(m)[0]];
		}
		
		return str;
		
	}
	
	
	public static void main(String[] args) {
		String[] listA = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] listB = {"KFC","Shogun","Burger King"};
		String[] result = new SumofTwoLists().findRestaurant(listA, listB);

		for(String a : result) {
			System.out.print(a + " ");
		}
	}
}

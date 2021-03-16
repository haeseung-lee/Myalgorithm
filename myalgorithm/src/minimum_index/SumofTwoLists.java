package minimum_index;

import java.util.ArrayList;
import java.util.Comparator;

public class SumofTwoLists {
	
	
	public String[] findRestaurant(String[] list1, String[] list2) {
		
		ArrayList<Integer> arrI = new ArrayList<>();
		ArrayList<Integer> arrJ = new ArrayList<>();
		ArrayList<Integer> arrSum = new ArrayList<>();
		
		for(int i = 0; i < list1.length; i++) {
			
			for(int j = 0; j < list2.length; j++) {
				
				if(list1[i].equals(list2[j])) {
					
					arrI.add(i);
					arrJ.add(j);
					arrSum.add(i+j);
				}
			}
		}
		
		for(int k = 1; k < arrSum.size(); k++) {
			
			int temp = arrSum.get(0);
			
			if(temp < arrSum.get(k)) {
				
				
			}
		}
		
			
				
				
				
		
		
		
		System.out.println(arrI +" " + arrJ + " " + arrSum);
		ArrayList<String> sArr = new ArrayList<>();
		
		Object[] obj = sArr.toArray();
		String[] str = new String[obj.length];
		for(int i = 0; i < str.length; i++ ) {
			str[i] = obj[i].toString();
		}
		
		return str;
		
	}
	public static void main(String[] args) {
		String[] listA = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] listB = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		String[] result = new SumofTwoLists().findRestaurant(listA, listB);

		for(String a : result) {
			System.out.print(a + " ");
		}
	}
}

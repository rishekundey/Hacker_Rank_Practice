package hacker_Rank_Package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

	public static List<Integer> dynamicArray_2(int n, List<List<Integer>> queries) {
		// Write your code here
		List<List<Integer>> seqList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			seqList.add(new ArrayList<>());
		}
		List<Integer> result = new ArrayList<>();
		int lastAnswer = 0;
		for (List<Integer> query : queries) {
			int qType = query.get(0);
			int x = query.get(1);
			int y = query.get(2);
			int idx = (x ^ lastAnswer) % n;
			if (qType == 1) {
				seqList.get(idx).add(y);
			} else if (qType == 2) {
				List<Integer> seq = seqList.get(idx);
				lastAnswer = seq.get(y % seq.size());
				result.add(lastAnswer);
			}
		}
		return result;
	}

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries){
		List<Integer> ansArr = new ArrayList<Integer>();
		int idx;
		int lA = 0;
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			arr.add(new ArrayList<Integer>());
		}
		for (List<Integer> query : queries) {
			int q = query.get(0);
			int x = query.get(1);
			int y = query.get(2);
			
			idx = (x ^ lA) % n;
			if(q == 1)
				arr.get(idx).add(y);
			else {
				lA = arr.get(idx).get(y % arr.get(idx).size());
				ansArr.add(lA);
			}
		}
		
		return ansArr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dynamicArray(2, Arrays.asList(
				Arrays.asList(1, 0, 5), 
				Arrays.asList(1, 1, 7), 
				Arrays.asList(1, 0, 3), 
				Arrays.asList(2, 1, 0), 
				Arrays.asList(2, 1, 1))));
		

	}

}

package hacker_Rank_Pacakge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

	
	public static int migratoryBirds(List<Integer> arr) {
		
		Map<Integer, Integer> map = new HashMap<>();

	    for (Integer num : arr) {
	        map.put(num, map.getOrDefault(num, 0) + 1);
	    }

	    int max = 0;
	    int birdId = Integer.MAX_VALUE; 

	    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	        int id = entry.getKey();
	        int count = entry.getValue();

	        if (count > max || (count == max && id < birdId)) {
	            max = count;
	            birdId = id;
	        }
	    }

	    return birdId;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		List<Integer> arr = Arrays.asList(1,1,2,2,3,3,3);
		
		int result = migratoryBirds(arr);
		System.out.println(result);
		
	}

}

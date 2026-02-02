package hacker_Rank_Pacakge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MaximumPerimeterTriangle {

    public static void main(String[] args) {
            int n = 6;
            List<Integer> sticks = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,10));
            List<Integer> result = maximumPerimeterTriangle(sticks);
            System.out.println(result);

    }

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
    	Collections.sort(sticks);
    	for(int i = sticks.size()-1; i>=2; i--) {
    		System.out.println("Stick.get("+i+"): "+sticks.get(i)+" Stick.get("+(i-1)+"): "+sticks.get(i-1)+" Stick.get("+(i-2)+"): "+sticks.get(i-2));
    		if(sticks.get(i) < sticks.get(i-1)+sticks.get(i-2))
    			return new ArrayList<Integer>(Arrays.asList(sticks.get(i-2), sticks.get(i-1), sticks.get(i)));
    	}
    		
    	return new ArrayList<Integer>(Arrays.asList(-1));

    }
    
}
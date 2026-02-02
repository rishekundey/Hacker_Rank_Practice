package hacker_Rank_Pacakge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Picking_Numbers {

	public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int maxLen = 0;
        int i = 0;

        for (int j = 0; j < a.size(); j++) {
            // shrink left until window valid
            while (a.get(j) - a.get(i) > 1) {
                i++;
            }
            int windowLen = j - i + 1;
            if (windowLen > maxLen) {
                maxLen = windowLen;
            }
        }

        return maxLen;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5));
		System.out.println(pickingNumbers(A));
	}

}

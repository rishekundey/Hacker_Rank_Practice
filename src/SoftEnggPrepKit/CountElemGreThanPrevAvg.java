package SoftEnggPrepKit;

import java.util.Arrays;
import java.util.List;

public class CountElemGreThanPrevAvg {

	public static int countResponseTimeRegressions(List<Integer> responseTimes) {
	    // Write your code here
		
		int count = 0;
		if (responseTimes == null || responseTimes.size() == 0) {
			return count;
		}
		long sum = responseTimes.get(0);
		for(int i=1; i<responseTimes.size(); i++) {
			long element = responseTimes.get(i);
			if ( element * i > sum ) {
				count++;
			}
			sum += element;
		}
		
		return count;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> responseTimes = Arrays.asList(100, 200, 150, 300);
		System.out.println(countResponseTimeRegressions(responseTimes));
		responseTimes = Arrays.asList(0);
		System.out.println(countResponseTimeRegressions(responseTimes));
		responseTimes = Arrays.asList(100);
		System.out.println(countResponseTimeRegressions(responseTimes));
		responseTimes = Arrays.asList(100, 50, 25, 10);
		System.out.println(countResponseTimeRegressions(responseTimes));
		responseTimes = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		System.out.println(countResponseTimeRegressions(responseTimes));
		responseTimes = Arrays.asList();
		System.out.println(countResponseTimeRegressions(responseTimes));
		responseTimes = Arrays.asList(173353923, 173353924, 173353919, 173353926, 173353925);
		System.out.println(countResponseTimeRegressions(responseTimes));
	}

}

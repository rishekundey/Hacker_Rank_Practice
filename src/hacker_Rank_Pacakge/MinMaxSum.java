package hacker_Rank_Pacakge;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    	long resArr[] = new long[2];
    	Collections.sort(arr);
    	for(int i=0;i<2;i++) {
    		for(int j=0;j<4;j++) {
    			resArr[i] = resArr[i]+arr.get(i+j);
    		}
    	}
    	if(resArr[0]<resArr[1])
    		System.out.println(resArr[0]+" "+resArr[1]);
    	else
    		System.out.println(resArr[1]+" "+resArr[0]);

    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result1.miniMaxSum(arr);

        bufferedReader.close();
    }
}

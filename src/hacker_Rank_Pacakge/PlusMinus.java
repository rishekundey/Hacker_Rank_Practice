package hacker_Rank_Pacakge;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class PlusMinus {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n;
		n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        plusMinus(arr);

        bufferedReader.close();

	}
	
	public static void plusMinus(List<Integer> arr) {
		
		double[] res = new double[3];
		int size = arr.size();
		
		for(int i=0; i < size; i++) {
			if(arr.get(i)<0)
				res[1]++;
			else if(arr.get(i)==0)
				res[2]++;
			else
				res[0]++;
		}
		
		for(int i=0; i<res.length; i++) {
			System.out.printf("%.6f\n", res[i]/size);
		}
		
	}

}

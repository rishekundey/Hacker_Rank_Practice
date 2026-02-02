package hacker_Rank_Pacakge;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DivisibleSumPairs {

	 public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		 int res = 0;
		 for(int i=0; i<n; i++) {
			 for (int j=i+1; j<n; j++) {
				 int sum = ar.get(i)+ar.get(j);
				 if(sum%k==0)
					 res++;
			 }
		 }
		 return res;
	 }
	
	/*
	  public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

      int n = Integer.parseInt(firstMultipleInput[0]);

      int k = Integer.parseInt(firstMultipleInput[1]);

      List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

      int result = Result.divisibleSumPairs(n, k, ar);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();

      bufferedReader.close();
      bufferedWriter.close();
    }
    */
	
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			scan.nextLine();
			String ar = scan.nextLine();
			List<Integer> arList = Arrays.stream(ar.trim().split("\\s+"))
					.map(Integer::parseInt)
					.collect(Collectors.toList());
			
			//System.out.println("\n"+"n= "+n+" k="+k+" ar="+arList);
			System.out.println(DivisibleSumPairs.divisibleSumPairs(n, k, arList));
		}
		
		
	}

}

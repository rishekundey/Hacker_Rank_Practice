package hacker_Rank_Pacakge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatchString {

	/*
	 public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings = IntStream.range(0, stringsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.matchingStrings(strings, queries);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainStr = "abcde";
		String part = "bcd";
		List<Integer> res = new ArrayList<Integer>();
		int count = 0;
		if(mainStr.equals(part)) {			
			System.out.println("True");
			count = 5;
		}
		res.add(count);
		System.out.println(res);
		//int len = res.size();
		Collections.sort(res);
	}
}

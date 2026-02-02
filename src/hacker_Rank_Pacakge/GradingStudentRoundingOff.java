package hacker_Rank_Pacakge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudentRoundingOff {

	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
		List<Integer> res = new ArrayList<Integer>();
		for(int i=0; i<grades.size(); i++) {
			int grade = grades.get(i);
			
			if(grade<38 || grade%5==0) 
				res.add(grade);
			else if(grade%5>0) {
				int roundOff = grade+(5-grade%5);
				if(roundOff-grade<3)
					res.add(roundOff);
				else
					res.add(grade);
			}
				
		}
		
		return res;
		
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrList = new ArrayList<Integer>(Arrays.asList(82, 84, 29, 57, 58, 30, 55, 38));
		List<Integer> result = GradingStudentRoundingOff.gradingStudents(arrList);
		
		for(int i=0; i<result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

	/*
	 * public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
    */
}

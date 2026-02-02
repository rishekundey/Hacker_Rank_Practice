package hacker_Rank_Pacakge;

import java.io.*;
import java.text.*;
import java.util.*;

class ResultTimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) throws ParseException {
    // Write your code here
    	DateFormat hr_12 = new SimpleDateFormat("hh:mm:ss aa");
    	DateFormat hr_24 = new SimpleDateFormat("HH:mm:ss");
    	Date time = hr_12.parse(s);
    	return hr_24.format(time);
    }
    
    public static void timeConv(String s) {
    	
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException, ParseException {
    	
    	Scanner reader = new Scanner(System.in);
    	
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = reader.nextLine();

        //String result = ResultTimeConversion.timeConversion(s);

       System.out.println(ResultTimeConversion.timeConversion(s));

        reader.close();
        
    }
}

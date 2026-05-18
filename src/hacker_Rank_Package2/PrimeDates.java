package hacker_Rank_Package2;

import java.util.Scanner;
import java.util.StringTokenizer;

// You are given two dates, and you have to find the number of prime dates between them (both inclusive). A date is called prime if the number formed by concatenating the date, month and year is divisible by 4 or 7.
// For example, 02-08-2025 is a prime date as the number formed by concatenating the date, month and year is 02082025 which is divisible by 4. Similarly, 04-09-2025 is also a prime date as the number formed by concatenating the date, month and year is 04092025 which is divisible by 7. On the other hand, 01-01-2025 is not a prime date as the number formed by concatenating the date, month and year is 01012025 which is not divisible by either 4 or 7.
// Input Format
// The first line contains two dates in the format dd-mm-yyyy separated by a space.
// Constraints
// 1 <= dd <= 31
// 1 <= mm <= 12
// 1 <= yyyy <= 10000
// Output Format
// Print the number of prime dates between the given two dates (both inclusive).
// Sample Input 0
// 02-08-2025 04-09-2025
// Sample Output 0
// 2
// Explanation 0
// The prime dates between 02-08-2025 and 04-09-2025 are 02-08-2025 and 04-09-2025.
// Sample Input 1
// 25-06-2365 07-09-8847
// Sample Output 1
// 846403
// Explanation 1
// The prime dates between 25-06-2365 and 07-09-8847 are 25-06-2365, 26-06-2365, 27-06-2365, 28-06-2365, 29-06-2365, 30-06-2365, 01-07-2365, 02-07-2365, 03-07-2365, 04-07-2365, 05-07-2365, 06-07-2365, 07-07-2365, 08-07-2365, 09-07-2365, 10-07-2365, 11-07-2365, 12-07-2365, 13-07-2365, 14-07-2365, 15-07-2365, 16-07-2365, 17-07-2365, 18-07-2365, 19-07-2365, 20-07-2365 and so on until we reach the date of 07 -09 -8847. There are a total of 846403 prime dates between these two dates (both inclusive).


public class PrimeDates {

    public static int month[];
    
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in  = new Scanner(System.in);
        //02-08-2025 04-09-2025   //5
        //25-06-2365 07-09-8847   //846403

        month = new int[13];

        String s = in.nextLine();

        StringTokenizer str = new StringTokenizer(s, "- ");
        
        //System.out.println("Input: " + s);

        int d1 = Integer.parseInt(str.nextToken());
        int m1 = Integer.parseInt(str.nextToken());
        int y1 = Integer.parseInt(str.nextToken());
        int d2 = Integer.parseInt(str.nextToken());
        int m2 = Integer.parseInt(str.nextToken());
        int y2 = Integer.parseInt(str.nextToken());
        
        System.out.println(d1 + " " + m1 + " " + y1);
        System.out.println(d2 + " " + m2 + " " + y2);
      
        int result = findPrimeDates(d1, m1, y1, d2, m2, y2);
        System.out.println(result);
   }

    public static void updateLeapYear(int year) {
        if(year % 400 == 0) {
            month[2] = 29;
        } else if(year % 100 == 0) {
            month[2] = 28;
        } else if(year % 4 == 0) {
            month[2] = 29;
        } else {
            month[2] = 28;
        }
    }
    
    public static void storeMonth() {
        month[1] = 31;
        month[2] = 28;
        month[3] = 31;
        month[4] = 30;
        month[5] = 31;
        month[6] = 30;
        month[7] = 31;
        month[8] = 31;
        month[9] = 30;
        month[10] = 31;
        month[11] = 30;
        month[12] = 31;
    }
   
   public static int findPrimeDates(int d1, int m1, int y1, int d2, int m2, int y2) {
        storeMonth();
    
        int result = 0;
    
        while(true) {
            int x = d1;           
            x = x * 100 + m1;
            x = x * 10000 + y1;
            System.out.println("x: " + x);
            
            if(x % 4 == 0 || x % 7 == 0) {
                result = result + 1;
            }
            if(d1 == d2 && m1 == m2 && y1 == y2) {
                break;
            }
            updateLeapYear(y1);
            d1 = d1 + 1;
            if(d1 > month[m1]) {
                m1 = m1 + 1;
                d1 = 1;
                if(m1 > 12) {
                    y1 =  y1 + 1;
                    m1 =  1;
                }
            }
        }
        return result;
    }
}
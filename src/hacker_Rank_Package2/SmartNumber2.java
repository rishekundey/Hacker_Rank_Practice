package hacker_Rank_Package2;

public class SmartNumber2 {

	public static boolean isSmartNumber(int num) {
		int val = (int) Math.sqrt(num);    
        if(num / val == val && num % val == 0)
            return true;
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 7, 169};
		//int[] arr = {17, 100, 88, 19, 41, 10, 16, 92};
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            boolean ans = isSmartNumber(num);
            if(ans){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }

	}

}

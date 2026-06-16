package hacker_Rank_Package2;

import java.util.Arrays;

public class ZigZagSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 2, 3, 4, 5, 6, 7};
        findZigZagSequence(a, a.length);

	}

	public static void findZigZagSequence(int [] a, int n){
		Arrays.sort(a); 			// 1 2 3 4 5 6 7
									// 0 1 2 3 4 5 6
        int mid = n/2;             // mid = 7/2 = 3
		int temp = a[mid];         // temp = a[3] = 4
        a[mid] = a[n - 1];        // a[3] = a[6] = 7
        a[n - 1] = temp;	      // a[6] = temp = 4
        // 1 2 3 7 5 6 4
        // 0 1 2 3 4 5 6
        int st = mid + 1;		// st = 4
        int ed = n - 2;			// ed = 5
        while(st <= ed){		// while(4 <= 6) -> while(5 <= 5)
            temp = a[st];		// temp = a[4] = 5
            a[st] = a[ed];		// a[4] = a[6] = 4
            a[ed] = temp;		// a[6] = temp = 5
            st = st + 1;		// st = 5
            ed = ed - 1;		// ed = 5
        }
        // 1 2 3 7 4 6 5 		// 1 2 3 7 6 5 4
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
	
}

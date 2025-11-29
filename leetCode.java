// public class Solution{
//     public static int[] twoSum(int[] nums, int target){
//      for(int i=0;i<nums.length;i++){
//         for(int j=i+1;j<nums.length;j++){
//             if(nums[i]+nums[j]==target){
//                 int[] ans={i, j};
//                 return ans;
//             }
//         }
//      }   
//      return new int[]{-1, -1};
//     }
// }

import java.util.*;

public class leetCode {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;  

        int original = x;
        long rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }

        return rev == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (isPalindrome(x))
            System.out.println("true");
        else
            System.out.println("false");
    }
 }


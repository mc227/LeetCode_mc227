package LeetCode.Problem9;

public class Solution {
    public boolean isPalindrome(int x) {
        // 121
        //121 % 10 = 1 (ones)
        // 121/10 = 12
        // 12 % 10 = 2 (tens)
        // 1 * 10 + 2 = 12
        // edge cases 0 is a palindrom
        // any negative number
        if(x < 0 || (x%10==0 && x!=0)){
            return false;
        }
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + (x%10);
            System.out.println(revertedNumber);
            System.out.println(x);
            x/=10;
        }
        System.out.println(x);
        return x == revertedNumber || x==revertedNumber/10;
    }
}

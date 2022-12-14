package LeetCode.Problem9;

public class Solution {
    public boolean isPalindrome(int x) {
        String stringInput = String.valueOf(x);
        int i = 0;
        int j = stringInput.length()-1;
        while(i < j){
            if(stringInput.charAt(i)==stringInput.charAt(j)){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(1111));
    }
}

/*
 * @lc app=leetcode id=299 lang=java
 *
 * [299] Bulls and Cows
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] nums = new int[10];
        for(int i=0; i<secret.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }else{
                if(nums[secret.charAt(i)-'0']++ < 0) cows++;
                if(nums[guess.charAt(i)-'0']-- >0) cows++;
            }
        }

        return bulls+"A"+cows+"B";
    }
}
// @lc code=end


import java.util.HashMap;
import java.util.Map.Entry;

/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 */

// @lc code=start
class Solution {
    public int compress(char[] chars) {
     int i = 0; int j = 0;

     while(i<chars.length){
         char cuurent = chars[i];
         int count = 0;

         while(i<chars.length && chars[i] == cuurent){
             i++;
             count++;
         }

         chars[j++] = cuurent;

         if(count>1){
             for(char c : Integer.toString(count).toCharArray()){
                 chars[j++] = c;
             }
         }
     }

     return j;

    }
}
// @lc code=end


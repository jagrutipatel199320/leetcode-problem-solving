import java.util.HashMap;

/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String[] arr = str.split(" ");
        HashMap<Character, String> map = new HashMap<Character,String>();

        if(arr.length!=pattern.length())
        return false;

        for(int i=0; i<arr.length;i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(arr[i]))
                return false;
            }else{
                if(map.containsValue(arr[i]))
                return false;

                map.put(c, arr[i]);
            }
        }

        return true;
    }
}
// @lc code=end


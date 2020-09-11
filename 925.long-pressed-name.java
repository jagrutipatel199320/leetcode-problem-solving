/*
 * @lc app=leetcode id=925 lang=java
 *
 * [925] Long Pressed Name
 */

// @lc code=start
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length() > typed.length())
        return false;

        int n = name.length();
        int m = typed.length();

        int i = 0;

        for(int j =0; j< m; j++){
            if(i<n && name.charAt(i) == typed.charAt(j)){
                i++;
            }else if(j == 0 || typed.charAt(j) != typed.charAt(j-1))
            
                return false;
            
        }

        return i==n;

    }
}
// @lc code=end


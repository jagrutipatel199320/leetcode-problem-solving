/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        String str =  String(a, "UTF-8");
        byte[] str = str.getBytes("UTF-8");

        for(byte s : str){
            System.out.println(s);
        }

    }
}
// @lc code=end


/*
 * @lc app=leetcode id=1047 lang=java
 *
 * [1047] Remove All Adjacent Duplicates In String
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> s = new Stack();

        for(char c: S.toCharArray()){
            if(!s.isEmpty() && c == s.peek()){
                s.pop();
            }else{
                s.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!s.isEmpty()){
            sb.append(s.pop());
        }

        return sb.reverse().toString();
    }
}
// @lc code=end


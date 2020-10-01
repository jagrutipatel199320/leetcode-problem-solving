/*
 * @lc app=leetcode id=1544 lang=java
 *
 * [1544] Make The String Great
 */

// @lc code=start
class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && (c-'A' == stack.peek() - 'a' || c -'a' == stack.peek() - 'A')){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
// @lc code=end


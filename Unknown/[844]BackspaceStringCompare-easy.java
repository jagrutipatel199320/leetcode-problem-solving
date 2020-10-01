/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String S, String T) {
        return stackSov(S).equals(stackSov(T));
    }

    public String stackSov(String str){
        Stack<Character> stack = new Stack<Character>();

        for(char c : str.toCharArray()){
            if(c != '#'){
                stack.push(c);
            }else if(!stack.isEmpty()){
                stack.pop();
            }
        }

        return stack.toString();
    }
}
// @lc code=end


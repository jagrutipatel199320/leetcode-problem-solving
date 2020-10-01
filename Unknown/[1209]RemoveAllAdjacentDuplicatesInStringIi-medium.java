/*
 * @lc app=leetcode id=1209 lang=java
 *
 * [1209] Remove All Adjacent Duplicates in String II
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> stack = new Stack();
        Stack<Integer> count = new Stack();
        
        for(char c:s.toCharArray()){
            
            if(!stack.isEmpty() && !count.isEmpty() && stack.peek() == c && count.peek() == k-1){
			
                while(!stack.isEmpty() && stack.peek() == c){
                    stack.pop();
                }
                count.pop();
            }else{
			
                int temp = 1;	
				
                if(!count.isEmpty() && stack.peek() == c){
                    temp += count.pop();
                }
                stack.push(c);
                count.push(temp);
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


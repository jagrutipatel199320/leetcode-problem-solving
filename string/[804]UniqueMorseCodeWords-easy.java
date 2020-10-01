/*
 * @lc app=leetcode id=804 lang=java
 *
 * [804] Unique Morse Code Words
 */

// @lc code=start
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<String>();
        String[] encodes= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for(String word : words){
            String temp = "";
            for(int i=0; i < word.length();i++){
                temp += encodes[word.charAt(i)-'a'];
            }
            set.add(temp);
        }

        return set.size();
    }
}
// @lc code=end


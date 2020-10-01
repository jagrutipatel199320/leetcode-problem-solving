/*
 * @lc app=leetcode id=1455 lang=java
 *
 * [1455] Check If a Word Occurs As a Prefix of Any Word in a Sentence
 */

// @lc code=start
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] sentence_word = sentence.split("\\s+");

        for(int i =0; i< sentence_word.length; i++){
            if(sentence_word[i].indexOf(searchWord) == 0){
                return i+1;
            }
        }

        return -1;
    }
}
// @lc code=end


import java.util.ArrayList;

/*
 * @lc app=leetcode id=500 lang=java
 *
 * [500] Keyboard Row
 */

// @lc code=start
class Solution {
    public String[] findWords(String[] words) {
        
     ArrayList<String> res = new ArrayList<>();
        int count =0;
        for (String word : words) {

            if(word.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")){
                res.add(count++, word);
            }
        }

        String[] result = new String[res.size()];
        for(int i =0; i< res.size(); i++){
            result[i]=res.get(i);
        }

        return result;

    }
}
// @lc code=end


import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * @lc app=leetcode id=884 lang=java
 *
 * [884] Uncommon Words from Two Sentences
 */

// @lc code=start
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> map = new HashMap<>();
        for(String word: (A+" "+B).split(" ")){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        ArrayList<String> res = new ArrayList<>();
        for(String w: map.keySet()){
            if(map.get(w) ==1){
                res.add(w);
            }
        }

        return res.toArray(new String[0]);
    }
}
// @lc code=end


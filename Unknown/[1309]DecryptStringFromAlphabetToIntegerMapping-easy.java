import java.util.HashMap;

/*
 * @lc app=leetcode id=1309 lang=java
 *
 * [1309] Decrypt String from Alphabet to Integer Mapping
 */

// @lc code=start
class Solution {
    public String freqAlphabets(String s) {
        HashMap<String,Character> map = new HashMap<>();
        int k = 1;
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(ch<'j'){
                map.put(String.valueOf(k++),ch);
            }else{
                map.put(String.valueOf((k++)+"#"),ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while(i >= 0){
            if(s.charAt(i) == '#'){
                sb.append(map.get(s.substring(i-2,i+1)));
                i = i -3;
            }else{
                sb.append((map.get(s.substring(i, i+1))));
                i--;
            }
        }

        return sb.reverse().toString();
    }
}
// @lc code=end


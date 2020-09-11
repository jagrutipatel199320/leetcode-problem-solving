import java.util.HashMap;

/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
         if(s.length() != t.length())
         return false;

         HashMap<Character,Character> map = new HashMap<Character,Character>();

         for(int i = 0,j=0; i<s.length(); i++,j++ ){
             if(map.containsKey(s.charAt(i))){
                if(t.charAt(j)!= map.get(s.charAt(i)))
                return false;
             }else{
                 if(map.containsValue(t.charAt(j)))
                 return false;
                 else
                 map.put(s.charAt(i),t.charAt(j));
             }
         }

         return true;

    }
}
// @lc code=end


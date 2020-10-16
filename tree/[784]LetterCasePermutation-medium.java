import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=784 lang=java
 *
 * [784] Letter Case Permutation
 */

// @lc code=start
class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        
       if(res == null) return res;

       res.add(S);

       for(int i=0;i<S.length();i++){
           if(Character.isLetter(S.charAt(i))){
            int n = res.size();

            for(int j=0;j<n;j++){
                char[] chs = res.get(j).toCharArray();

                if(Character.isLowerCase(chs[i])){
                    chs[i] = Character.toUpperCase(chs[i]);
                }else{
                    chs[i] = Character.toLowerCase(chs[i]);
                }

                res.add(String.valueOf(chs));
            }
           }
          

       }
       return res;
    }
}
// @lc code=end


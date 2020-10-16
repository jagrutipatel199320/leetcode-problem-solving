import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=929 lang=java
 *
 * [929] Unique Email Addresses
 */

// @lc code=start
class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> res = new HashSet<>();

        for(String email :emails){
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");
            res.add(local[0].replace(".","")+"@"+parts[1]);

        }

        return res.size();
    }
}
// @lc code=end


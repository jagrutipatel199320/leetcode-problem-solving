import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        if(s == null || s.length() == 0)
        return 0;
        else{
        String res[] = s.split("\\s+");
        List<String> list = new ArrayList<String>(Arrays.asList(res));
        list.removeAll(Arrays.asList("",null));
        return list.size();
        }
    }
}
// @lc code=end


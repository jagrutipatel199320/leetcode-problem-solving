import java.util.ArrayList;
import java.util.List;

import jdk.javadoc.internal.doclets.toolkit.taglets.ReturnTaglet;

/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
    List<String> res = new ArrayList<String>(n);

        for(int i=1; i<=n;i++){
            if(i%15 == 0)
            res.add("FizzBuzz");
            else if(i%3 == 0)
            res.add("Fizz");
            else if(i%5 == 0)
            res.add("Buzz");
            else
            res.add( String.valueOf(i));
        }

        return res;

    }
}
// @lc code=end


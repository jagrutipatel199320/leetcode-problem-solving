/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        
     
        int la = a.length() - 1;
        int lb = b.length() - 1;

        StringBuilder sb= new StringBuilder();
        int carry = 0;
        while(la >=0 || lb >=0){
            int abit = la>=0? a.charAt(la--) - '0' : 0;
            int bbit = lb>=0? b.charAt(lb--) - '0' : 0;
                       
            int sum = abit + bbit +carry;

            carry = sum>1?1:0;

            if(sum <=1)
                sb.insert(0, sum);

            if(sum == 2)
                sb.insert(0, 0);
            
            if(sum == 3)
                sb.insert(0, 1);
        }

        if(carry == 1)
            sb.insert(0, 1);
        

        return sb.toString();
    }
}
// @lc code=end


/*
 * @lc app=leetcode id=1552 lang=java
 *
 * [1552] Magnetic Force Between Two Balls
 */

// @lc code=start
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        
        int low = 1, high = position[position.length-1]-position[0];
        if(m==2)return high;
        
        while(low<high)
        {
            int guessedForce = low+(high-low)/2+1;
           
            if(isValid(guessedForce,position,m))low = guessedForce;
            else high = guessedForce-1;
                   
        }
        
        return low;
    }

    private boolean isValid(int guessedForce, int[] pos, int m)
    {
        //sorted array
        // find the count of subarrays with sum of differences >= guessedForce then curCount++..cursum =0
        // if(curCount==m-1)return true
        
        int curSum =0, curCount =0;
        
        for(int i =1 ;i<pos.length;i++)
        {
            curSum += pos[i]-pos[i-1];
            if(curSum>=guessedForce)
            {
                curCount++;
                curSum=0;
            }
            if(curCount>=m-1)return true;
        }
        
        
        return false;
    }
  

}
// @lc code=end


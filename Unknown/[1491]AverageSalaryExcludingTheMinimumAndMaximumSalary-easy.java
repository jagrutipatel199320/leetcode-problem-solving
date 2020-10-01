/*
 * @lc app=leetcode id=1491 lang=java
 *
 * [1491] Average Salary Excluding the Minimum and Maximum Salary
 */

// @lc code=start
class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);

        double sum = 0;

        for(int i = 1; i< salary.length - 1; i++){
            sum += salary[i];
        }

        return sum/(salary.length - 2);
    }
}
// @lc code=end


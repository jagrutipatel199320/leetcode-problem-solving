/*
 * @lc app=leetcode id=1219 lang=java
 *
 * [1219] Path with Maximum Gold
 */

// @lc code=start
class Solution {
    int count =0;
    public int getMaximumGold(int[][] grid) {
    
        for(int i =0; i< grid.length; i++){
            for(int j=0; j< grid[i].length; j++){
                if(grid[i][j] != 0){
                    count = Math.max(count, dfs(grid,i,j,0));
                }
            }
        }
        return count;
    }

    public int dfs(int[][] grid, int i, int j,int count){
        if(i<0 || j<0 || i>= grid.length || j>=grid[i].length){
            return count;
        }else if(grid[i][j] !=0){
            count += grid[i][j];
            int temp = grid[i][j];
            grid[i][j] = 0;

            int l = dfs(grid,i-1,j,count);
            int r = dfs(grid, i+1, j,count);
            int u =  dfs(grid, i, j-1,count);
            int d = dfs(grid, i, j+1,count);

            grid[i][j] = temp;
            int maxh = Math.max(l,r);
            int maxv = Math.max(u,d);
            return Math.max(maxh,maxv);
            
        }else{
            return count;
        }
    }
}
// @lc code=end


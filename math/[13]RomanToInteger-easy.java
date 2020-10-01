/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int[] number = new int[s.length()];
        int i = 0;
        //for(int num : number )
        //    System.out.println(num);


        while(i < s.length()){
            switch (s.charAt(i)) {
                case 'I':
                    number[i] = 1;
                    break;
                
                case 'V':
                    number[i] = 5;
                    break;
                
                case 'X':
                    number[i] = 10;
                    break;
                
                case 'L':
                    number[i] = 50;
                    break;
                
                case 'C':
                    number[i] = 100;
                    break;

                case 'D':
                    number[i] = 500;
                    break;

                case 'M':
                    number[i] = 1000;
                    break;
                
                default:
                    break;

            }
            i++;
        }

        
        int sum =0;
        //i = 0;

        for(i =0; i < number.length-1; i++){
            if(number[i]<number[i+1])
            sum  = sum -number[i];
            else
            sum = sum + number[i];
        }

        //System.out.println(sum + number[number.length -1]);

        return sum + number[number.length -1];

    }
}
// @lc code=end


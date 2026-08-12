class Solution {
    public int maxArea(int[] height) 
    {
        int i, j,maxWater,result;
        i=0;
        j=height.length-1;
        maxWater=0;
        while(i<=j)
        {
        result=(j-i)*Math.min(height[i],height[j]);
        maxWater=Math.max(result,maxWater);
        if(height[i]<height[j]) i++;
        else j--;
        }
        return maxWater;
    }
}

/*
1. Place pointers at both ends.
2. Calculate current area.
3. Update maximum area.
4. Move the shorter wall inward.
5. Repeat until i >= j.
*/
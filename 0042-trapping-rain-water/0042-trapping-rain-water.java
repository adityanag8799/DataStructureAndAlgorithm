class Solution {
    public int trap(int[] height) 
    {
    int i=0;
    int j=height.length-1;
    int leftMax=0;
    int rightMax=0;
    int maxWater=0;
    while(i<j)
    {
        if(height[i]<height[j])
        {
        if(height[i] > leftMax) leftMax=height[i];
        else  maxWater += leftMax-height[i];
        i++;
        }
        else
        {
        if(height[j] > rightMax) rightMax=height[j];
        else maxWater += rightMax-height[j];
        j--;
        }
    }
        return maxWater;
        
    }

    /*
1. Keep two pointers at both ends.
2. Maintain leftMax and rightMax.
3. Process the side with the smaller height.
4. Update max if current bar is taller.
5. Otherwise, trap water = max - current height.
6. Move that pointer inward.
7. Continue until i >= j.
*/
}
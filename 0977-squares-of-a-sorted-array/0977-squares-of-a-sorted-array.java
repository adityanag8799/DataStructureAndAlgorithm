class Solution {
    private int square(int num)
    {
        return num*num;
    }
    public int[] sortedSquares(int[] nums) 
    {
    int [] result=new int[nums.length];
    int i=0;
    int j=nums.length-1;
    int k=nums.length-1;
    while(i<=j)
    {
        if(square(nums[i]) > square(nums[j]))
        {
            result[k]=square(nums[i]);
            k--;
            i++;
        }
        else
        {
            result[k]=square(nums[j]);
            k--;
            j--;
        }
    }
        return result;
    }
}

/*
1. i → left, j → right, k → last index of result.
2. Compare squares of nums[i] and nums[j].
3. Place the larger square at result[k].
4. Move the corresponding pointer (i or j).
5. Decrement k.
6. Continue until i > j.
*/
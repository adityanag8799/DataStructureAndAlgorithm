class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
    int i=m-1;
    int j=n-1;
    int k=m+n-1;
    while(i>=0 && j>=0)
    {
    if(nums1[i]>nums2[j])
    {
    nums1[k]=nums1[i];
    i--;
    }
    else
    {
    nums1[k]=nums2[j];
    j--;
    }
    k--;
    }

    while(j>=0)
    {
        nums1[k]=nums2[j];
        j--;
        k--;
    }
    }
}

/*
Use three pointers: i (end of nums1), j (end of nums2), and k (last index of nums1).
Compare elements from the end and place the larger one at nums1[k].
Move the corresponding pointer backward.
Copy any remaining elements from nums2.
*/
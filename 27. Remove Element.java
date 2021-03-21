class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0,temp;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                count++;
            }
            else
            {
                nums[i]=0;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]<nums[j])
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return count;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count= 1;
        int maiorSeq=0;
        if(nums.length==1 || nums.length==0) 
            return nums.length;
        for(int i=1;i<nums.length; i++){
            if(nums[i]==(nums[i-1]+1)){
                count++;
            }else if(nums[i]!=(nums[i-1]))
                count=1;

            if(count>maiorSeq)
                    maiorSeq = count;
        }
        return maiorSeq;
    }
}

public class MaxSubarraySum {
  int maxSubarraySum(int[] nums) {
       if(nums.length==1) return nums[0];
        int sum=0,maxSum=nums[0];
        for(int el:nums){
            sum=Math.max(sum,0);
            sum+=el;
            maxSum=Math.max(sum,maxSum);
        } return maxSum;
    }
}

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
      int sum=0;
      int max=0;
      int left=0;
      HashSet<Integer> set =new HashSet<>();
       for(int right=0;right<nums.length;right++){
        while(set.contains(nums[right])){
            set.remove(nums[left]);
            sum=sum-nums[left];
            left++;
        }
        set.add(nums[right]);
        sum=sum+nums[right];
        if(sum>max){
            max=sum;
        }
       }   
       return max;
    }
}
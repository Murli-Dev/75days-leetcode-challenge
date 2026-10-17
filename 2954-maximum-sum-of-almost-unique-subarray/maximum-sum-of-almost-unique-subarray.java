class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long sum=0;
        long max=0;
        int left=0;
        int distinct=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int right=0;right<nums.size();right++){
           int num=nums.get(right);
           sum=sum+num;
           if(!map.containsKey(num)){
            map.put(num,1);
            distinct++;
           }
           else{
            map.put(num,map.get(num)+1);
           }
           if(right-left+1>k){
            int remove=nums.get(left);
            sum=sum-remove;
            if(map.get(remove)==1){
                map.remove(remove);
                distinct--;
            }
            else{
                map.put(remove,map.get(remove)-1);
            }
            left++;
           }
           if(right-left+1==k && distinct>=m){
            if(sum>max){
                max=sum;
            }
           }
        }
        return max;
    }
}
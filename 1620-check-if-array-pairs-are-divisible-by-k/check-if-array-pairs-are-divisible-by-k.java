class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num :arr){
            int rem = num%k;
            if(rem<0){
                rem+=k;
            }
            int partner =(k-rem)%k;
            if(map.containsKey(partner)){
                map.put(partner,map.get(partner)-1);
                if(map.get(partner)==0){
                    map.remove(partner);
                }
            }
            else{
            map.put(rem,map.getOrDefault(rem,0)+1);
            }
        }
        return map.isEmpty();
    }
}
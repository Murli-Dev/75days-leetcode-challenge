class Solution {
    public int characterReplacement(String s, int k) {
       HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int maxFreq=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)>maxFreq){
                maxFreq=map.get(c);
            }
            int windowSize=right-left+1;
            if(windowSize-maxFreq>k){
                char leftChar=s.charAt(left);
                map.put(leftChar,map.get(leftChar)-1);
                left++;
            }
            int currentSize=right-left+1;
            if(currentSize>max){
                max=currentSize;
            }
            
        }
        return max;
    }
}
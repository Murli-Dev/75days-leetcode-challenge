class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
        int left =0;
        int right=words[i].length()-1;
        while(left<right){
            if(words[i].charAt(left)!=words[i].charAt(right)){
                break;
            }
            left++;
            right--;
        }
        if(left>=right){
            return words[i];
        }
        }
        return "";
    }
}
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left=0;
        int CountT=0;
        int  CountF=0;
        int maxLength=0;
        for(int right=0;right<answerKey.length();right++){
            char c=answerKey.charAt(right);
            if(c=='T'){
                CountT++;
            }
            else if(c=='F'){
                CountF++;
            }
            while(CountT>k && CountF>k){
                char leftchar=answerKey.charAt(left);
                if(leftchar=='T'){
                    CountT--;
                }
                else if(leftchar=='F'){
                    CountF--;
                }
                left++;
            }
            int length=right-left+1;
            if(length>maxLength){
                maxLength=length;
            }

        }
        return maxLength;
    }
}
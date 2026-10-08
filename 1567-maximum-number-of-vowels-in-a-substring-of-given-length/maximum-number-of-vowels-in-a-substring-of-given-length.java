class Solution {
    public int maxVowels(String s, int k) {
     int count =0;
     int max=0;
     for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            count++;
        }
        if(i>=k){
            char remove = s.charAt(i-k);
            if(remove=='a' || remove=='e' || remove=='i' || remove=='o' || remove=='u' ){
                count--;
            }
        }
        if(count>max){
            max=count;
        }
     }
     return max;
    }
}
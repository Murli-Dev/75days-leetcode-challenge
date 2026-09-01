class Solution {
    public String reverseWords(String s) {
        String[] words =s.trim().split("\\s+");
        String reverse = "";
        for(int i=words.length-1; i>=0;i--){
            reverse =reverse+words[i];
            if(i!=0){
                reverse=reverse+ " ";
            }
        }
        return reverse;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder result = new StringBuilder();
        int[] count = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result.append(c);

            int last = result.length() - 1;

            if (last > 0 && result.charAt(last - 1) == c) {
                count[last] = count[last - 1] + 1;
            } else {
                count[last] = 1;
            }

            if (count[last] == k) {
                result.delete(result.length() - k, result.length());
            }
        }

        return result.toString();
    }
}
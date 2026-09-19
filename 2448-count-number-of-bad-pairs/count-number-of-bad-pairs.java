class Solution {
    public long countBadPairs(int[] nums) {
        long badPairs = 0;
        HashMap<Integer, Long> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;

            long goodPairs = map.getOrDefault(key, 0L);

            badPairs += i - goodPairs;

            map.put(key, goodPairs + 1);
        }

        return badPairs;
    }
}
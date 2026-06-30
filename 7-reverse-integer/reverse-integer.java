class Solution {
    public int reverse(int x) {
        if(x==0)return x;
        long num = 0;
        long n = Math.abs((long)x);
        while (n > 0) {
            long rem = n % 10;
            num = num * 10 + rem;
            n = n / 10;
        }
        if(num<Integer.MIN_VALUE || num>Integer.MAX_VALUE)return 0;
        if (x < 0 )
            return (int)-num;
        return (int)num;
    }
}
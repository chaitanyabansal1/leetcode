class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        return false;
        int result = (int) Math.pow(2, 30);
        if(n>0 && result%n==0)
        return true;
        else
        return false;
    }
}
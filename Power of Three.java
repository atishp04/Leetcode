public class Solution {
    public boolean isPowerOfThree(int n) {
        double res = Math.log10(n) / Math.log10(3);
        if(res % 1 == 0)
            return true;
        else
            return false;
    }
}
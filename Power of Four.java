public class Solution {
    public boolean isPowerOfFour(int num) {
        return ((Math.log10(num) / Math.log10(4)) % 1 == 0);
    }
  
}
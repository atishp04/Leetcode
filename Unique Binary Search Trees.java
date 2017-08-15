public class Solution {
    public int numTrees(int n) {
        int total[] = new int[n+1];
        total[0] = total[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                total[i] += total[j - 1] * total[i - j];
            }
        }
        return total[n];
    }
}
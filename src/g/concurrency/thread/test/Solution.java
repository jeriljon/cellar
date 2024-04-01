package g.concurrency.thread.test;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] X, int[] Y) {
        Map<String, Integer> fractionCount = new HashMap<>();
        
        for (int i = 0; i < X.length; i++) {
            int gcd = BigInteger.valueOf(X[i]).gcd(BigInteger.valueOf(Y[i])).intValue();
            String normalizedFraction = (X[i] / gcd) + "/" + (Y[i] / gcd);
            fractionCount.put(normalizedFraction, fractionCount.getOrDefault(normalizedFraction, 0) + 1);
        }
        
        return fractionCount.values().stream().max(Integer::compare).orElse(0);
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] X1 = {1, 2, 3, 4, 0};
        int[] Y1 = {2, 3, 6, 8, 4};
        System.out.println(solution.solution(X1, Y1)); // Expected: 3
        
        // Test case 2
        int[] X2 = {3, 3, 4};
        int[] Y2 = {5, 4, 3};
        System.out.println(solution.solution(X2, Y2)); // Expected: 1
        
        // Test case 3
        int[] X3 = {4, 4, 7, 1, 2};
        int[] Y3 = {4, 4, 8, 1, 2};
        System.out.println(solution.solution(X3, Y3)); // Expected: 4
        
        // Test case 4
        int[] X4 = {1, 2, 3, 1, 2};
        int[] Y4 = {2, 4, 6, 5, 10};
        System.out.println(solution.solution(X4, Y4)); // Expected: 3
    }
}

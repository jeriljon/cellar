package w.interview.problems;

public class Problem5 {

    public static void main(String[] args) {
        try {
            testSolution();
            System.out.println("All test cases passed.");
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void testSolution() {
        Problem5 solution = new Problem5();

        // Helper method to check the result
        checkResult(solution.transform("CBACD"), "C", "Test Case 1");
        checkResult(solution.transform("CABABD"), "", "Test Case 2");
        checkResult(solution.transform("AABBCCDD"), "AABBCCDD", "Test Case 3");
        checkResult(solution.transform("ABABCDCD"), "", "Test Case 4");
        checkResult(solution.transform("ACBD"), "ACBD", "Test Case 5");
        checkResult(solution.transform("AABB"), "", "Test Case 6");
    }

    public static void checkResult(String actual, String expected, String testCase) {
        if (!actual.equals(expected)) {
            throw new RuntimeException("Test failed for " + testCase + ": Expected " + expected + " but got " + actual);
        } else {
            System.out.println("Test passed for " + testCase);
        }
    }

    private static String transform(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean found = true;

        while(found) {
            found = false;
            for(int i = 0; i < sb.length() - 1; i++) {
                if ((sb.charAt(i) == 'A' && sb.charAt(i + 1) == 'B') ||
                        (sb.charAt(i) == 'C' && sb.charAt(i + 1) == 'D')) {
                    sb.delete(i, i + 2);  // Efficiently remove the adjacent pair
                    found = true;
                    break;  // Restart the loop after a modification
                }
            }
        }
        return sb.toString();  // Convert the StringBuilder back to String
    }
}

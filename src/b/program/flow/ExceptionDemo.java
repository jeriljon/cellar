package b.program.flow;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            // Handling the exception
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // This block is optional and always executes whether an exception is thrown or not
            System.out.println("The 'try catch' is finished.");
        }
    }
}

public class Factorial {
    private static int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursive case
        else {
            return (n * factorial(n-1));
        }
    }
    public static void main( String args[] ) {
        // Calling from main
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}

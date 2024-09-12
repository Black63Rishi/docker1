public class Fibonacci {
    // Recursive method to calculate Fibonacci series
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base case: fib(0) = 0, fib(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive step
    }

    public static void main(String[] args) {
        int terms = 10;  // Number of terms to display

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

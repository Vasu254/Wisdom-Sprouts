public class Day18 {
    public static int Countdivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 1;
        int div= Countdivisors(n);
        System.out.println("Number of divisors of " + n + " is: " + div);
    }
}

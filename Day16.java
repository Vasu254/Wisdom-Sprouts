public class Day16 {
    public static int findLCM(int num1, int num2) {
        int max = Math.max(num1, num2);
        int lcm = max;
        while (lcm % num1 != 0 || lcm % num2 != 0) {
            lcm += max;
        }
        return lcm;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        int lcm = findLCM(n, m);
        System.out.println("Least Common Multiple of Two Numbers " + n + " and " + m + " is: " + lcm);
    }
}

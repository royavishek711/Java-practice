import java.util.*;
public class StrongNumberInRangeExample {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        for (int i = start; i <= end; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i + " is a strong number");
            }
        }
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

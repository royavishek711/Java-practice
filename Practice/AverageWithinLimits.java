import java.util.*;
public class AverageWithinLimits {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int sum=0;
        while(a>0){
            int rem=a%10;
            sum+=rem;
            a=a/10;
        }
        if (sum%3==0) System.out.println("TRUE");
        else System.out.println("FALSE");
    }
}

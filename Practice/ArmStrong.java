import java.util.*;
public class ArmStrong {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=n;
        int sum = 0;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem*rem;
            n/=10;
        }
        if (a==sum)
        System.out.println("Armstrong");
        else 
        System.out.println("Not Armstrong");
        sc.close();
    }
}

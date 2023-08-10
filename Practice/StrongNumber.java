import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for (int i=a;i<=b;i++) {
            int c=i,sum=0;
            while(c>0){
                int rem=c%10;
                sum+=fact(rem);
                c=c/10;
            }
            if (sum==i) System.out.println(sum);
        }
        sc.close();
    }
    public static int fact(int n){
        if (n==0 || n==1) return 1;
        else return n*fact(n-1);
    }
}

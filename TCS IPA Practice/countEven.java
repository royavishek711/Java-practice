import java.util.*;
public class countEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt(); int count=0;
        while(n>0){
            int x=n%10;
            if (x%2==0) count++;
            n/=10;
        }
        if (count>3) System.out.println(count);
        else System.out.println("it is not a valid number");
    }
}

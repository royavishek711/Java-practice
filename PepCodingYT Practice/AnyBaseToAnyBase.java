import java.util.*;
public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        System.out.println("Enter the base of the number ");
        int base = sc.nextInt();
        System.out.println("Enter the base that you want to convert the number");
        int resbase=sc.nextInt();
        anytoany(number,base,resbase);
        sc.close();

    }
    public static void anytoany(int number , int base, int resbase){
        int count=0,ans=0;
        while(number>0){
            int rem=number%resbase;
            ans+=rem*(int)(Math.pow(base,count));
            count++;
            number/=resbase;
        }
        System.out.println("Resultant number with base "+resbase+" is "+ans);
    }
}

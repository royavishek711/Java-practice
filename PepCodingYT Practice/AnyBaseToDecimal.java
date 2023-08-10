import java.util.*;
public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Enter the base");
        int base = sc.nextInt();
        basetodec(number,base);
        sc.close();
    }
    public static void basetodec(int number,int base){
        int ans=0,count=0;
        while(number >0){
            int rem=number%10;
            ans+=rem*(int)(Math.pow(base,count));
            count++;
            number/=10;
        }
        System.out.println("Result of the number with base "+base+" is equals to decimal of: "+ans);
    }
}

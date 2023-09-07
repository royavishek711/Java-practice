import java.util.*;
public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter the base of the numbers");
        int base=sc.nextInt();
        add(num1, num2, base);

    }
    public static void add(int num1, int num2, int base) {
        int ans=0,count=1,carry=0;
        while(num1>0||num2>0||carry>0){
            int rem1=num1%10;
            int rem2=num2%10;
            num1/=10;            
            num2/=10;            
            int x=rem1+rem2+carry;
            carry=x/base;
            x=x%base;
            ans+=x*count;
            count*=10;
        }
        System.out.println("Addition is: "+ans);
    } 
}

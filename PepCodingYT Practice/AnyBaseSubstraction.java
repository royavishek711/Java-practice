import java.util.*;
public class AnyBaseSubstraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter the base of the numbers");
        int base=sc.nextInt();
        sub(num1, num2, base);
    }
    public static void sub(int num1, int num2, int base) {
        int ans=0,count=1,borrow=0;
        while(num1>0){
            int rem1=num1%10;
            int rem2=num2%10;
            num1/=10;            
            num2/=10;
            int x=0;
            // rem1+=borrow;
            // if (rem1>=rem2){
            //     borrow=0;
            //     x=rem1-rem2;
            // }
            // else{
            //     borrow=-1;
            //     x=rem1+base-rem2;

            // }
            rem2+=borrow;
            if (rem1<rem2){
                x=rem1+base-rem2;
                borrow=1;
            }
            else{
                x=rem1-rem2;
                borrow=0;
            }
            ans+=x*count;
            count*=10;
        }
        System.out.println("substraction is: "+ans);
    }
}

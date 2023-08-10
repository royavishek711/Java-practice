import java.util.*;
public class DecimalToBase{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a decimal number:");
        int dec=sc.nextInt();
        System.out.println("Enter the base:");
        int base=sc.nextInt();
        dectobase(dec,base);
        
        
        
        sc.close();
    }
    public static void dectobase(int dec, int base){
        int rem=0,count=0,ans=0;
        while(dec>0){
            rem=dec%base;
            ans=ans+(rem*(int)(Math.pow(10,count)));
            count++;
            dec/=base;
        }
        System.out.println("Result number with base "+base+" is: "+ans);
    }
    
}
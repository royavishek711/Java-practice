import java.util.*;
public class DigitsFreq{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number: ");
        long num=sc.nextLong();
        System.out.println("Enter the number to check frequency:");
        int freq=sc.nextInt();
        int count=0;
        while(num>0){
            long rem =num%10;
            if (rem==freq){
                count++;
            }
            num/=10;
        }
        System.out.println("Frequency of "+freq+" is: "+count);
        sc.close();
    }
}
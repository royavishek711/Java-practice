import java.util.*;
public class SimProgram {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        Sim[] arr=new Sim[5];
        for (int i=0;i<5;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            double c=sc.nextDouble(); sc.nextLine();
            double d=sc.nextDouble(); sc.nextLine();
            String e=sc.nextLine();
            arr[i]=new Sim(a,b,c,d,e);
        }
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        Sim[] ans=transferCustomerCircle(arr,s1,s2);
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i].simId+" "+ans[i].customerName+" "+ans[i].circle+" "+ans[i].ratePerSecond);
        }
    }

    public static Sim[] transferCustomerCircle (Sim[] arr,String s1,String s2){
        Sim[] arr2=new Sim[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i].circle.equalsIgnoreCase(s1)){
                arr[i].circle=s2;
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        for (int i=0;i<arr2.length-1;i++){
            for (int j=0;j<arr2.length-i-1;j++){
                if (arr2[j].ratePerSecond<arr2[j+1].ratePerSecond){
                    Sim temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                }
            }
        }
        return arr2;
    }
}

class Sim{
    int simId;
    String customerName;
    double balance;
    double ratePerSecond;
    String circle;

    public Sim(int simId,String customerName ,double balance ,double ratePerSecond  ,String circle){
        this.simId=simId;
        this.customerName=customerName;
        this.balance=balance;
        this.ratePerSecond=ratePerSecond;
        this.circle=circle;
    }

    int getsimId(){ return simId;}
    String getcustomerName(){ return customerName;}
    double getbalace(){ return balance;}
    double getratePerSecond(){ return ratePerSecond;}
    String getcircle(){ return circle;}
}
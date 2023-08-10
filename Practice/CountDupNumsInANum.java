import java.util.*;

public class CountDupNumsInANum {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        for (int i=a;i<=b;i++){
            int ans=i;
            boolean[] arr=new boolean[10];
            while(ans>0){
                if (arr[ans%10]==true) break;
                arr[ans%10]=true;
                ans/=10;
            }
            if (ans==0) count++;
        }
        System.out.println(count);
        sc.close();
    }
}

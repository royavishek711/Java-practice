import java.util.*;
public class MaxOfArrInRange {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int [] arr=new int[a];
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt(); int y=sc.nextInt();
        maxArrRange(arr,x,y);
        sc.close();
    }
    static void maxArrRange(int [] arr,int x,int y){
        int ans =arr[0];
        for (int i=x;i<=y;i++){
            if (arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
}


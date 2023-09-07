import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        int i=0,j=size-1;
        while(i<j){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
        for (int x:arr){
            System.out.print(x+" ");
        }
        sc.close();
    }
}

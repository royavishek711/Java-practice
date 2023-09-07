import java.util.*;

public class RotateArraybyK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int [] res=new int[size];
        int ind=0;
        k=k%size;
        if (k<0) k+=size;
        for (int i=size-k;i<size;i++){
            res[ind]=arr[i];
            ind++;
        }
        for (int i=0;i<size-k;i++){
            res[ind]=arr[i];
            ind++;
        }
        for (int val:res){
            System.out.print(val+" ");
        }
        sc.close();
    }    
}

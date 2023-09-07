import java.util.*;
public class InverseOfAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        int [] res=new int[size];
        for (int i=0; i<size; i++){
            int x=arr[i];
            res[x]=i;
        }
        for (int i : res) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}

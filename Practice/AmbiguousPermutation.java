import java.util.*;
public class AmbiguousPermutation {
    public static void main(String[] args) {
        while(true){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter array size: ");
        int a=sc.nextInt();
        if (a==0) 
        break;
        boolean flag=true;
        int [] arr=new int[a];
        int [] arr2= new int[a];
        System.out.println("Enter array elements: ");
        for (int i=0; i<a; i++) {
            arr[i]=sc.nextInt();
            arr2[arr[i]-1]=i+1;
        }
        for (int i=0; i<a; i++) {
            if (arr[i]!=arr2[i]){
                flag=false;
                break;
            }
        }
        System.out.println(flag ? "ambiguous" : "not ambiguous");
    }
}
}

import java.util.*;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of 1st array: ");
        int size1=sc.nextInt();
        int [] arr1=new int[size1];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<size1;i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of 2nd array: ");
        int size2=sc.nextInt();
        int [] arr2=new int[size2];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<size2;i++) {
            arr2[i]=sc.nextInt();
        }

        int[] res=new int[size1>=size2?size1:size2];
        int carry=0;
        int k=res.length-1;
        while(k>=0){
            int x=((size1>0?arr1[size1-1]:0)+(size2>0?arr2[size2-1]:0))+carry;
            res[k]=x%10;
            carry=x/10;
            if (size1>0) size1--;
            if (size2>0) size2--;
            k--;
        }
        System.out.println("Resultant array is: ");
        if (carry>0){
            System.out.print(carry);
        }
        for (int val:res){
            System.out.print(val);
        }
        sc.close();
    }    
}

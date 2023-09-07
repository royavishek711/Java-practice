import java.util.*;
public class DiffOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int size1=sc.nextInt();
        int [] arr1=new int[size1];
        for (int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        int size2=sc.nextInt();
        int [] arr2=new int[size2];
        for (int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }

        int[] res=new int[size1>=size2?size1:size2];
        int k=res.length-1;
        int borrow=0;
        while(k>=0){
            
            if (arr1[size1-1]<=(size2>0?arr2[size2-1]:0)){
                res[k]=arr1[size1-1]+10-((size2>0?arr2[size2-1]:0)+borrow);
                borrow=1;
            }
            else{
                res[k]=arr1[size1-1]-((size2>0?arr2[size2-1]:0)+borrow);
                borrow=0;
            }
            
            k--;
            size1--;
            size2--;
        }
        int index=0;
        while(index<res.length){
            if (res[index]==0){
                index++;
            }
            else{
                break;
            }
        }

        while(index<res.length){
            System.out.print(res[index]+" ");
            index++;
        }
        sc.close();
    }
}

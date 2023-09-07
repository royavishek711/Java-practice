import java.util.*;
public class SubSetsOfAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for (int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0; i<(int)Math.pow(2,size); i++){
            String set="";
            int temp=i;
            for (int j=size-1; j>=0; j--){
                //converting i to binary form like 0's and 1's
                int rem=temp%2;
                temp/=2;
                if (rem==0) {
                    set="-"+"\t"+set;
                }
                else{
                    set=arr[j]+"\t"+set;
                }
            }
            System.out.println(set);
        }
        sc.close();
        
    }
}

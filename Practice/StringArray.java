import java.util.*;
public class StringArray {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        String[] arr=new String[a];
        for (int i=0;i<a;i++){
            arr[i]=sc.next();
        }
        System.out.println(Arrays.toString(arr));
        for (String s:arr){
            System.out.print(s+ " ");
        }
        sc.close();
    }
}

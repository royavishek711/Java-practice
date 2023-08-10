import java.util.*;
public class ArraySyntax {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i:arr){
            System.out.print(i+" ");
        }
        
    }
}

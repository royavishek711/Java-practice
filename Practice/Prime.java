import java.util.*;
public class Prime {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==0){
            System.out.println("Prime");
        }
        else {
            System.out.println("not Prime");
        }
        sc.close();
    }
}

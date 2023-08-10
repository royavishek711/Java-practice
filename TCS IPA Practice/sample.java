import java.util.*;
public class sample{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        answer [] arr=new answer[5];
        for (int i=0;i<5;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            arr[i]=new answer(a,b,c,d);
        }
        String s=sc.nextLine();
        int [] ans=method(arr,s);
        if (ans==null) System.out.println("No such Id found");
        else {
            for (int i=0;i<ans.length;i++){
                System.out.println(ans[i]);
            }
        }

    }

    public static int[] method (answer [] arr, String s){
        int [] arr2=new int[0];
        for (int i=0;i<5;i++){
            if (arr[i].tech.equalsIgnoreCase(s)&&arr[i].exp%5==0){
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i].id;
            }
        }
        if (arr2.length==0) return null;
        else return arr2;
    }
}

class answer{
    int id;
    String name;
    String tech;
    int exp;

    public answer(int a,String b, String c , int d){
        id=a;
        name=b;
        tech =c;
        exp=d;
    }
}
import java.util.*;
public class AssociateProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();sc.nextLine();
        Associate [] arr=new Associate[size];
        for (int i=0;i<arr.length;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            double c=sc.nextDouble();sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            arr[i]=new Associate(a,b,c,d);
        }
        double e=sc.nextDouble();sc.nextLine();
        Associate ans=searchscore(arr, e);
        if (ans==null) System.out.println("No associate found");
        else {
            System.out.println(ans.id);
            System.out.println(ans.name);
        }
        Associate ans2=maxexp(arr);
        System.out.println(ans2.id);
    }

    static Associate searchscore(Associate[] arr,double e){
        for (int i=0;i<arr.length;i++){
            if (arr[i].score==e){
                return arr[i];
            }
        }
        return null;
    }

    static Associate maxexp(Associate[] arr){
        int x=arr[0].exp;
        for (int i=1;i<arr.length;i++){
            if (arr[i].exp>x){
                x= arr[i].exp;
            }
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i].exp==x){
                return arr[i];
            }
        }
        return null;
    }
}

class Associate{
    int id;
    String name;
    double score;
    int exp;

    public Associate(int a,String b,double c,int d){
        id =a;
        name =b;
        score=c;
        exp=d;

    }
}

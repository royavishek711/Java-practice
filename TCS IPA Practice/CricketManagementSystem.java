import java.util.*;
public class CricketManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        cricket[] arr=new cricket[size];
        for(int i=0;i<size;i++){
            int a=sc.nextInt();sc.nextLine();
            int b=sc.nextInt();sc.nextLine();
            int c=sc.nextInt();sc.nextLine();
            String d=sc.nextLine();
            String e=sc.nextLine();
            arr[i]=new cricket(a, b, c, d, e);
        }
        int x=sc.nextInt();sc.nextLine();
        System.out.println(findCricketerWithMinimum(arr));
        cricket ans=searchCricketerByld(arr,x);
        if (ans==null) System.out.println("No such Cricketer");
        else {
            System.out.println(ans.id);
            System.out.println(ans.name);
        }
    }

    public static int findCricketerWithMinimum(cricket[] arr){
        int min=arr[0].matches;
        for (int i=1;i<arr.length;i++){
            if (arr[i].matches<min){
                min=arr[i].matches;
            }
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i].matches==min){
                return arr[i].id;
            }
        }
        return 0;
    }

    public static cricket searchCricketerByld(cricket[] arr,int x){
        for (int i=0;i<arr.length;i++){
            if (arr[i].id==x) {
                return arr[i];
            }
        }
        return null;
    }
}
class cricket{
    int id;
    int matches;
    int runs;
    String name;
    String team;

    public cricket(int a,int b,int c,String d,String e){
        id =a;
        matches=b;
        runs=c;
        name=d;
        team=e;
    }
}

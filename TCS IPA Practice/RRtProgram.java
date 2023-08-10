import java.util.*;

public class RRtProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        rrt[] arr=new rrt[4];
        for (int i=0;i<4;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            String e=sc.nextLine();
            arr[i]=new rrt(a,b,c,d,e);
        }
        String s=sc.nextLine();
        rrt ans=method(arr,s);
        if (ans==null) System.out.println("no such ticket");
        else{
            System.out.println(ans.tno);
            System.out.println(ans.raised);
            System.out.println(ans.assigned);
        }
    }    

    static rrt method(rrt[] arr,String s){
        rrt[] arr2=new rrt[0];
        for (int i=0;i<4;i++){
            if (arr[i].proj.equalsIgnoreCase(s)){
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }

        for (int i=0;i<arr2.length-1;i++){
            for(int j=0;j<arr2.length-i-1;j++){
                if (arr2[j].priority>arr2[j+1].priority){
                    rrt temp=arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }
        if (arr2.length>0) return arr2[0];
        else return null;
    }
}

class rrt{
    int tno;
    String raised;
    String assigned;
    int priority;
    String proj;

    public rrt(int a,String b, String c, int d,String e){
        tno=a;
        raised=b;
        assigned=c;
        priority=d;
        proj=e;
    }
}

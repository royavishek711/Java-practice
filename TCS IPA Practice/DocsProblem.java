import java.util.*;
public class DocsProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        doc [] arr=new doc[4];
        for (int i=0;i<4;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            arr[i]=new doc(a,b,c,d);
        }
        doc [] ans=method(arr);
        if (ans==null) System.out.println("not valid");
        else {
            for (int i=0; i<ans.length; i++){
                System.out.println(ans[i].id+" "+ans[i].title+" "+ans[i].name+" "+ans[i].pages);
            }
        }
    }

    public static doc[] method(doc[] arr){
        doc[] arr2=new doc[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i].pages%2!=0){
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr2.length-i-1;j++){
                if (arr2[j].id>arr2[j+1].id){
                    doc temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                }
            }
        }
        if (arr2.length>0) return arr2;
        else return null;
    }
}

class doc{
    int id;
    String title;
    String name;
    int pages;

    public doc (int a,String b,String c,int d){
        id=a;
        title=b;
        name=c;
        pages=d;
    }
}
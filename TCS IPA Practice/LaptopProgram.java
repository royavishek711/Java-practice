import java.util.*;
public class LaptopProgram {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        laptop[] arr=new laptop[4];
        for (int i=0;i<4;i++){
            int a=sc.nextInt();sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble(); sc.nextLine();
            int e=sc.nextInt(); sc.nextLine();
            arr[i]=new laptop(a,b,c,d,e);
        }
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int x=countlaps(arr,s1);
        if (x!=0) 
        System.out.println(x);
        else 
        System.out.println("Brand is not available");
        laptop[] ans=laptopbyos(arr,s2);
        if (ans==null) 
        System.out.println("given os is not available");
        else {
            for (int i=0;i<ans.length;i++){
                System.out.println(ans[i].getid());
                System.out.println(ans[i].getrating());
            }
        }
    }
    //method 1
    public static int countlaps(laptop[] arr,String s1){
        int [] arr2=new int[0]; 
        int count=0;
        for (int i=0;i<4;i++){
            if (arr[i].getbrand().equalsIgnoreCase(s1)){
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i].getrating();
            }
        }
        for (int i=0;i<arr2.length;i++){
            if (arr2[i]>3) 
            count++;
        }
        if (arr2.length>0) 
        return count;
        else 
        return 0;
    }
    //method 2
    public static laptop[] laptopbyos(laptop[] arr,String s2){
        laptop[] arr3=new laptop[0];
        for (int i=0;i<4;i++){
            if (arr[i].getos().equalsIgnoreCase(s2)){
                arr3=Arrays.copyOf(arr3,arr3.length+1);
                arr3[arr3.length-1]=arr[i];
            }
        }
        for (int i=0;i<arr3.length-1;i++){
            for (int j=0;j<arr3.length-i-1;j++){
                if (arr3[j].getid()<arr3[j+1].getid()){
                    laptop temp=arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=temp;
                }
            }
        }
        if (arr3.length>0) return arr3;
        else return null;
    }
}
//class
class laptop{
    private int id;
    private String brand;
    private String os;
    private double price;
    private int rating;
    //constructor
    public laptop(int id,String brand,String os,double price,int rating){
        this.id=id;
        this.brand=brand;
        this.os=os;
        this.price=price;
        this.rating =rating;
    }
    //getters
        public int getid(){ 
            return id;
        }
        public String getbrand(){ 
            return brand; 
        }
        public String getos(){ 
            return os;
        }
        public double getprice(){
            return price;
        }
        public int getrating(){
            return rating;
        }
        //setters
        public void setid(int id){ 
            this.id=id;
        }
        public void setbrand(String brand){
            this.brand=brand;
        }
        public void setos(String os){ 
            this.os=os;
        }
        public void setprice(double price){ 
            this.price=price;
        }
        public void setrating (int rating){
            this.rating=rating;
        }
}

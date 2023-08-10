import java.util.*;
public class FlowersProgram {
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        Flowers[] arr=new Flowers[4];
        for (int i=0;i<4;i++){
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt();sc.nextLine();
            int d=sc.nextInt();sc.nextLine();
            String e=sc.nextLine();
            arr[i]=new Flowers(a,b,c,d,e);
        }
        String f=sc.nextLine();
        Flowers [] ans=findMinPriceByType(arr,f);
        if (ans==null) System.out.println("There is no flower");
        else {
            System.out.println(ans[0].getFlowerid());
        }

    }

    public static Flowers[] findMinPriceByType(Flowers[] arr,String f){
        Flowers[] arr2=new Flowers[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i].getType().equalsIgnoreCase(f) && arr[i].getRating()>3){
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        for (int i=0;i<arr2.length-1;i++){
            for (int j=0;j<arr2.length-i-1;j++){
                if (arr2[j].getPrice()>arr2[j+1].getPrice()){
                    Flowers temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                }
            }
        }
        if (arr2.length>0) return arr2;
        else return null;
    }
}

class Flowers {
    //if we make variables private then we have to use getters and setters
    private int flowerid;
    private String flowername;              
    private int price;
    private int rating ;
    private String type;

    public Flowers(int flowerid,String flowername,int price,int rating ,String type){
        this.flowerid=flowerid;
        this.flowername=flowername;
        this.price=price;
        this.rating=rating;
        this.type=type;
    }
    //getters
    public int getFlowerid(){
        return flowerid;
    }
    public String getFlowername(){
        return flowername;
    }
    public int getPrice(){
        return price;
    }
    public int getRating(){
        return rating;
    }
    public String getType(){
        return type;
    }
    //setters
    public void setFlowerid(int flowerid){
        this.flowerid=flowerid;
    }
    public void setFlowername(String flowername){
        this.flowername=flowername;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setRating(int rating){
        this.rating=rating;
    }
    public void setType(String type){
        this.type=type;
    }

}



//***************************************Another optimal approach*********************************************************************************** */

/*import java.util.Scanner;



public class MyClass {

    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            Flowers[] flowers=new Flowers[4];



        for (int i = 0; i <4 ; i++) {

          int a=sc.nextInt();sc.nextLine();

          String b=sc.nextLine();

          int c=sc.nextInt();sc.nextLine();

          int d=sc.nextInt();sc.nextLine();

          String e=sc.nextLine();

           flowers[i]  = new Flowers(a,b,c,d,e);

        }



        String input=sc.nextLine();

       int ans= findMinPriceByType(flowers,input);

       if(ans==0)

       {

           System.out.println("There is no flower with given type");

       }

       else

       {

           System.out.println(ans);

       }

    }



   public static int findMinPriceByType(Flowers[] flowers,String input)

    {

         int idd=Integer.MAX_VALUE;

         int min=Integer.MAX_VALUE;



        for (int i = 0; i <flowers.length ; i++) {

            if(flowers[i].getType().equalsIgnoreCase(input) && flowers[i].getRating()>3 && flowers[i].getPrice()<min)

            {

                min=flowers[i].getPrice();

                idd=flowers[i].getFlowerId();

            }



        }





         if(min!=Integer.MAX_VALUE)

         {

             return idd;

         }

         return 0;



    }



}





class Flowers

{

   private int flowerId;

  private  String flowerName;

   private int price;

   private int rating;

   private String type;



   //parametrized constructor





    public Flowers(int flowerId, String flowerName, int price, int rating, String type) {

        this.flowerId = flowerId;

        this.flowerName = flowerName;

        this.price = price;

        this.rating = rating;

        this.type = type;

    }



//getter and Setters





    public int getFlowerId() {

        return flowerId;

    }



    public void setFlowerId(int flowerId) {

        this.flowerId = flowerId;

    }



    public String getFlowerName() {

        return flowerName;

    }



    public void setFlowerName(String flowerName) {

        this.flowerName = flowerName;

    }



    public int getPrice() {

        return price;

    }



    public void setPrice(int price) {

        this.price = price;

    }



    public int getRating() {

        return rating;

    }



    public void setRating(int rating) {

        this.rating = rating;

    }



    public String getType() {

        return type;

    }



    public void setType(String type) {

        this.type = type;

    }

}*/
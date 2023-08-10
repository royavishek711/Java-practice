import java.util.*;
public class PlayerProgram{
public static void main(String [] args){
Scanner sc=new Scanner (System.in);
     Player[] arr=new Player[4];
     for (int i=0;i<4;i++){
     int a=sc.nextInt(); sc.nextLine();
     String b=sc.nextLine();
     int c=sc.nextInt(); sc.nextLine();
     String d=sc.nextLine();
     String e=sc.nextLine();
     arr[i]=new Player(a,b,c,d,e);
     }
     String s1=sc.nextLine();
     String s2=sc.nextLine();
     int x=findPlayerWithLowestRuns(arr,s1);
   if (x==0) System.out.println("No such player");
     else System.out.println(x);
     int[] ans=findPlayerByMatchType(arr,s2);
     if (ans==null) System.out.println("No player with given MatchType");
     else {
     for (int i=ans.length-1;i>=0;i--){
     System.out.println(ans[i]);
     }
     }
     
}

public static int findPlayerWithLowestRuns(Player[] arr,String s1){
int [] arr2= new int [0];
for (int i=0;i<4;i++){
if (arr[i].getplayertype().equalsIgnoreCase(s1)){
 arr2=Arrays.copyOf(arr2,arr2.length+1);
arr2[arr2.length-1]=arr[i].getruns();
}
}
Arrays.sort(arr2);
if (arr2.length>0) return arr2[0];
else return 0;

}

// public static Player[] findPlayerByMatchType(Player[] arr,String s2){
// Player[] arr3=new Player[0];
// for (int i=0;i<4;i++){
// if (arr[i].getmatchtype().equalsIgnoreCase(s2)){
// arr3=Arrays.copyOf(arr3,arr3.length+1);
// arr3[arr3.length-1]=arr[i];
//  }
// }
// for (int i=0;i<arr3.length-1;i++){
// for (int j=0;j<arr3.length-i-1;j++){
// if (arr3[j].getplayerid()>arr3[j].getplayerid()){
// Player temp=arr3[j];
// arr[j]=arr3[j+1];
// arr3[j+1]=temp;
// }
// }
// }


// if (arr3.length>0){ return arr3;}
// else return null;
// }
public static int[] findPlayerByMatchType(Player[] arr,String s2){
int[] arr3=new int[0];
for (int i=0;i<4;i++){
if (arr[i].getmatchtype().equalsIgnoreCase(s2)){
arr3=Arrays.copyOf(arr3,arr3.length+1);
arr3[arr3.length-1]=arr[i].getplayerid();
 }
}
// for (int i=0;i<arr3.length-1;i++){
// for (int j=0;j<arr3.length-i-1;j++){
// if (arr3[j].getplayerid()>arr3[j].getplayerid()){
// Player temp=arr3[j];
// arr[j]=arr3[j+1];
// arr3[j+1]=temp;
// }
// }
// }
Arrays.sort(arr3);

if (arr3.length>0){ return arr3;}
else return null;
}
   }

class Player{
private int playerid;
private String playername;
private int runs;
private String playertype;
private String matchtype;

public Player(int playerid,String playername, int runs, String playertype, String matchtype){
this.playerid=playerid;
this.playername=playername;
this.runs=runs;
this.playertype=playertype;
this.matchtype=matchtype;

}
public int getplayerid(){return playerid;}
public String getplayername(){return playername;}
public int getruns(){return runs;}
public String getplayertype(){return playertype;}
public String getmatchtype(){return matchtype;}

public void setplayerid(int playerid){this.playerid=playerid;}
public void setplayername(String playername){this.playername=playername;}
public void setruns(int runs){this.runs=runs;}
public void setplayertype(String playertype){this.playertype=playertype;}
public void setmatchtype(String matchtype){this.matchtype=matchtype;}
}
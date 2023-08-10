import java.util.*;
public class ArrayListEx {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        ArrayList <Integer> list=new ArrayList<>(a);
        ArrayList<Integer> list2=new ArrayList<>();
        for (int i=0;i<a;i++) {
            list.add(sc.nextInt());
        }

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        // list.add(8);
        // list.add(7);
        // list.add(6);
        // System.out.println(list.contains(5)); 
        // System.out.println(list);
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        // list.set(0, 100);
        // list.remove(4);
        // list.clear();
        // System.out.println(list.equals(list2));
        // list.addAll(3, list2);
        // System.out.println( list.containsAll(list2));
        System.out.println(list);

        // System.out.println(list.size());
    }
}

import java.util.ArrayList;

public class arraylist {
    //operation on arraylist

    public static void main(String args[]) {
        //add an element in aaraylist
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("ADD ELEMENT IN LIST : "  + list);

        //Get index
        int element=list.get(3);
        System.out.println("GET INDEX AT 3 ELEMENT IS : " + element);

        // remove element 
        list.remove(2);
        System.out.println("remove element at index 2 from list :" + list);

        // set element at index
        list.set(2, 10);
        System.out.println("SET ELEMENT 10 AT INDEX 2 : "+ list);

        //contain element
        System.out.println("it contain 2 or not : "+ list.contains(2));
    }
}

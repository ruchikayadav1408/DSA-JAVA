import java.util.ArrayList;
import java.util.Collections;
public class arraylistbasics {
    //print reverse arraylist
    public static void main(String args[]) {
        //add an element in arraylist
        ArrayList<Integer> list = new ArrayList<>();

        list.add(8);
        list.add(3);
        list.add(9);
        list.add(4);

        System.out.println("ADD ELEMENT IN LIST : "  + list);
        
        //sort list
        Collections.sort(list);
        System.out.println("SORTED LIST IN ASCENDING ORDER :  "+ list);

        //SORT IN DESCENDING ORDER
        Collections.sort(list , Collections.reverseOrder());
        System.out.println("SORT IN DESCENDING ORDER :  "+ list);


         //reverse list
        System.out.println("REVERSE LIST");
       for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i)+ " ");
       }
       
       //max element from the list
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
       System.out.println();
        System.out.println("maximum element :  " + max);

        //swap two numbers
        System.out.println("swap two numbers : ");
        int idx1=1, idx2=3; 
        swap(list, idx1, idx2);
        System.out.println(list);
    }

    //swap 2 numbers
    public static  void swap(ArrayList<Integer> list, int idx1 , int idx2) {
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        
    }
}

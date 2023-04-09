import java.util.*;
public class hashset {
    public static void main(String args[]) {
        HashSet<Integer> hs= new HashSet<>();
        //ADD  O(1)
        hs.add(1);
        hs.add(3);
        hs.add(2);
        hs.add(3);
        hs.add(1);

        System.out.println(hs);
        //REMOVE O(1)
        hs.remove(2);
        System.out.println(hs);
        if(hs.contains(2)){  //contain key O(1)
            System.out.println("set contains");
        }
        System.out.println(hs.size());
    }
}

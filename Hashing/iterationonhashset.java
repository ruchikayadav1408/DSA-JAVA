import java.util.*;

public class iterationonhashset {
    public static void main(String args[]) {
        HashSet<String> set= new HashSet<>();
        set.add("delhi");
        set.add("mumbai");
        set.add("UP"); 

        //using iterator

        Iterator i= set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("--------");
        //advanced loop
        for (String city : set) {
            System.out.println(city);
            
        }
        
    }
}

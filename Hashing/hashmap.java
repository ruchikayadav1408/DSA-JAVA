import java.util.HashMap;
public class hashmap {
    public static void main(String args[]){
        //create  
        HashMap<String , Integer> hm= new HashMap<>();
        // add - O(1)
        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("China", 150);

        System.out.println(hm);
        
        //get -O(1)
        System.out.println(hm.get("China"));

        //containskey O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));
   
        //remove O(1)
        hm.remove("India");
        System.out.println(hm);

        //size
        System.out.println(hm.size());
    }    
}

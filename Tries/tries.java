
import java.util.*;


public class tries {
    static class Node{
     Node children[]= new Node[26];
     boolean eow= false;
    public Node() {
        for(int i=0;i<26;i++){
            children[i]= null;
        }
    }
    
}
public static Node root = new Node();
public static void insert(String word) {  //O(L)
    Node curr= root;
    for(int level=0;level<word.length();level++){
        int idx= word.charAt(level) - 'a';
        if(curr.children[idx]== null){
            curr.children[idx]= new Node();
        }
        curr= curr.children[idx]; 
    }
    curr.eow= true;

    
}

        //search -O(L)
    public static boolean search(String key){
        Node curr= root;
    for(int level=0;level<key.length();level++){
        int idx= key.charAt(level) - 'a';
        if(curr.children[idx]== null){
            return false;
        }
        curr= curr.children[idx]; 
    }
            return curr.eow== true;
    }

    //wordbreak
    public static boolean wordbreak(String key) {
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
        if(search(key.substring(0,i)) &&
        wordbreak(key.substring(i))){
            return true;
        }
        }
        return false;
    }

   
    public static void main(String args[]) {
    String arr[]= {"i" ,"like" ,"samsung" ,"mobile" ,"sam"};

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        String key="ilikesamsung";
        System.out.println(wordbreak(key));
       // System.out.println();
      //  System.out.println("SEARCH THEE : " + search("thee"));
      //  System.out.println("SEARCH THOR : " +  search("thor"));
    }
}

import java.util.LinkedList;
public class jcf {
    //JAVA COLLECTION FRAMEWORK

     public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();       
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll); 
    }
    
}

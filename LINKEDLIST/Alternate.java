import java.util.*;
public class Alternate {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    
    }
    public static Node head;
    public static Node tail;
    public void addLast(int data){
        Node newNode = new Node(data);
       
        if(head== null){
           head=tail=newNode;
           return;
        } 
        tail.next=newNode;
        tail=newNode;
   }
   public void print(){
       if(head==null){
           System.out.println("LL IS EMPTY");
       }
       Node temp= head;
       while(temp!= null){
           System.out.print(temp.data + "->");
           temp=temp.next;

       }
       System.out.println("null");
   }

   public static  void zigzag(){
    //find mid
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!= null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid= slow;

    //reverse 2md half
    Node curr=mid.next;
    mid.next= null;
    Node prev= null;
    Node next;

    while(curr!= null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr= next;
    }
    Node left= head;
    Node right= prev;
    Node nextL, nextR;

    //ALTERNATE MERGE- ZIGZAG
    while(left!= null && right!=null){
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;

        left=nextL;
        right=nextR;

    }

   }
     public static void main(String args[]) {
        LinkedList ll= new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();

        ll.zigzag();
        ll.print();

        
    }
    
}

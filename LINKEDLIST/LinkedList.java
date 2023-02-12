public class LinkedList {

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

    
    public  void addfirst(int data) {
        // step -1 CREATE NEW NODE
       Node NewNode = new Node(data);
        if(head==null){
            head=tail=NewNode;
            return;
        }
        //step-2 newnodenext= head
        NewNode.next= head;
        //step 3 head=newnode
        head=NewNode;
        
    }
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
    public static void main(String args[]) {
        LinkedList ll= new LinkedList();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();

        
    }
    
}

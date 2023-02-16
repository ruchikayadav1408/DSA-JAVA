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
    public static int size;

    
    public  void addfirst(int data) {
        // step -1 CREATE NEW NODE
       Node NewNode = new Node(data);
       size++;
           
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
         size++;
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

    // ADD IN THE MIDDLE
    public void add(int idx, int data){
        Node newNode= new Node(data);
        if(idx==0){
            addfirst(data);
            return;
        }
        size++;
        Node temp= head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    //remove first
    public int removefirst() {
        size--;
        int val= head.data;
        head=head.next;
        return val; 
    }

    // remove last from ll
    public int removelast(){
        if(size==0){
            System.out.println("LL IS EMPTY");
            return Integer.MIN_VALUE;

        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    
    //itertive search
     public static int itrsearch(int key){  //O(n)
        Node temp= head;
        int i=0;
        while(temp!= null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;

        }
        return -1;
     }
     //RECURSIVE SEARCH

     public static int helper(Node head, int key){
        if(head==null){
            return -1;

        }
        if(head.data==key){
            return 0;

        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

     }
     public static int recsearch(int key){
        return helper(head, key);
     }
    
    public static void main(String args[]) {
        LinkedList ll= new LinkedList();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 6);
        ll.print();
        ll.removefirst();
        ll.print();
        ll.removelast();
        ll.print();

        
    }
    
}

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

//ADD FIRST    
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
    //ADD LAST
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
    
    //PRINT
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
    //reverse A ll
    public void reverse() {
        Node prev= null;
        Node curr=tail=head;
        Node next;

        while(curr!= null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        
     }
    
     //remove Nth node from end
      public void removeNthnode(int n){
        int sz=0;
        Node temp= head;
        while(temp != null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head= head.next;
        }
        int i=1;
        int iTofind= sz-n;
        Node prev= head;
        while(i<iTofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

      }
    
     //LL IS PALINDROME
      public static Node findmid(Node head){
            Node  slow= head;
            Node fast=head;
            while(fast !=null && fast.next!=null){
                slow=slow.next;//+1
                fast=fast.next.next;//+2
            }
            return slow;
      }
    
      public static boolean palindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //find mid
        Node midNode= findmid(head);
        //reverse 2nd half ll
        Node prev=null;
        Node curr=midNode;
        Node next;
         while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
        //check 1st half=2nd half
        Node left= head;
        Node right= prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
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

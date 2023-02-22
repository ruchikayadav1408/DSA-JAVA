//import java.util.LinkedList;


public class SortLL {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    
    }
    public static Node head;
    public  void addfirst(int data) {
        // step -1 CREATE NEW NODE
       Node NewNode = new Node(data);
      
           
        if(head==null){
            head=NewNode;
            return;
        }
        //step-2 newnodenext= head
        NewNode.next= head;
        //step 3 head=newnode
        head=NewNode;
        
    }

    //merge sort in LL

    private Node findmid(Node head){
        Node slow= head;
        Node fast=head.next;
         while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

         }
         return slow;

    }
    private Node merge(Node head1, Node head2){
        Node mergedll=new Node(-1);
        Node temp=mergedll;
         while(head1!=null && head2!=null){
            if(head1.data<= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
            while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            
            while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
            return mergedll.next;
            }
            
    public Node MergeSort(Node head){
        if(head==null || head.next== null){
            return head;

        }
        //find mid
            Node mid= findmid(head);
            //left and right MS
            Node righthead= mid.next;
           mid.next=null;
           Node newLeft=MergeSort(head);
           Node newRight=MergeSort(righthead);

           //merge
           return merge(newLeft, newRight);
    }

    public static void print(){
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
    public static void main(String args[]){
        LinkedList ll= new LinkedList();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.print();
        ll.head= ll.MergeSort(ll.head);
        ll.print();

    }
    
}

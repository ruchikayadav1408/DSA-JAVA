// REMOVE CYCLE
    public static void removecycle(){
        Node slow= head;
        Node fast= head;
        boolean cycle= false;
        // detect cycle
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle= true;
                break;
            }
        }
        if(cycle==false){
            return ;
        }
        //meeting point

        slow=head;
        Node prev= null;//lastnode
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle - last node = null
        prev.next=null;

    }

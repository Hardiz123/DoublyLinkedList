public class DoublyLinkedList {
    
    private ListNode head;
    private ListNode tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail=null;
    }

    public void addNode(int data) {
        ListNode newNode = new ListNode(data);
        if(head==null){
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
            tail= newNode;
            tail.next=null;
        }
    }

    public void addAtFirst(int data) {
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            tail = newNode;
        }else{
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
        }

    public void insertAtMiddle(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            System.out.println("Cannot insert in middle the list is empty");
        }else{

            int mid = (length() % 2 == 0) ? (length()/2) : ((length()+1)/2);
            ListNode current =head;
            ListNode temp=null;

            for(int i=1;i<mid;i++){
                current =current.next;
            }
            temp = current.next;
            temp.previous = current;

            current.next = newNode;
            newNode.previous = current;
            newNode.next = temp;
            temp.previous = newNode; 
        }
    }


    public void printList() {
        ListNode temp = head;
        if(isEmpty()){
            return;
        }
        while(temp!=null){
            System.out.print(temp.data + "--> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void printreverse() {
        if(isEmpty()){
            return;
        }
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.data+ "--> ");
            temp = temp.previous;
        }
        System.out.println();
    }


    public boolean isEmpty() {
        return ( head==null);
    }

    public int length() {
        int len=0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        return len;
    }


}
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
            System.out.println("Cannot insert in middle the list is empty"); //If list is empty
        }else{

            int mid = (length() % 2 == 0) ? (length()/2) : ((length()+1)/2); // this ill give the mid point
            ListNode current =head; //point to the head
            ListNode temp=null;

            for(int i=1;i<mid;i++){
                current =current.next; //point to the element to the next we want to add new node
            }
            temp = current.next; // assigned to the next of current node
            temp.previous = current; // next will point to the previous node

            current.next = newNode; // current will point to the new node
            newNode.previous = current; // new node will point to the previous node
            newNode.next = temp; // new node will point to the next node
            temp.previous = newNode; // next node will point to the new Node
        }
    }
    public void insertAtpos(int pos , int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            System.out.println("Cannot insert in middle the list is empty"); //If list is empty
        }else if(pos==1){
            addAtFirst(data);
        }else if(pos>length()){
            System.out.println("cannot add the position is wrong");
        }else{

            // int mid = (length() % 2 == 0) ? (length()/2) : ((length()+1)/2); // this ill give the mid point
            ListNode current =head; //point to the head
            ListNode temp=null;

            for(int i=1;i<pos-1;i++){
                current =current.next; //point to the element to the next we want to add new node
            }
            temp = current.next; // assigned to the next of current node
            temp.previous = current; // next will point to the previous node

            current.next = newNode; // current will point to the new node
            newNode.previous = current; // new node will point to the previous node
            newNode.next = temp; // new node will point to the next node
            temp.previous = newNode; // next node will point to the new Node
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
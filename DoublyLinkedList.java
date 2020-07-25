// DoublyLinkedList class has been created in a seperate file 
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
    public void deleteAtFirst(){ //delete at first
        if(head==null){
            return ;
        }
        head = head.next;
        head.previous = null;
    }

    public void deleteAtlast() {
        tail = tail.previous;
        tail.next = null;
    }

    public void deleteAtmiddle() {
        if(length()==1){
            deleteAtFirst();
        }else if(length()==2){
            deleteAtlast();
        }
        else{
        int mid = (length() % 2 == 0) ? (length()/2) : ((length()+1)/2);

        ListNode t;
        t =head;
        for(int i=1;i<mid;i++)
        {
            t = t.next;
        }
        t.previous.next=t.next;
        t.next.previous=t.previous;
        t=t.next;
        }
    }

    public void deleteAtpos(int pos) {
        if(pos==1){
            deleteAtFirst();
        }else if(pos==length()){
            deleteAtlast();
        }
        else if(pos>1 && pos<length()){
        ListNode t;
        t =head;
        for(int i=1;i<pos;i++)
        {
            t = t.next;
        }
        t.previous.next=t.next;
        t.next.previous=t.previous;
        t=t.next;
        }
    }

    public void deleteByValue(int val) {
        if(head.data==val){
            deleteAtFirst();
        }else if(tail.data==val){
            deleteAtlast();
        }else{
            ListNode temp=head;
            while (temp!=null && temp.data!=val) {
                temp = temp.next;
            }
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
            temp = temp.next;
        }
    }



// Transversal of list
    public void printList() {
        ListNode temp = head;
        if(isEmpty()){ // is a function created to check if list is empty or not
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
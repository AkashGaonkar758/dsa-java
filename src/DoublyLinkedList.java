public class DoublyLinkedList{

    private Node2 head;
    private Node2 tail;


    public DoublyLinkedList(){
        head = null;
        tail = null;;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int data){
        Node2 n1 = new Node2(data);
        if(isEmpty()){
            tail = n1;
            n1.setNext( head);
            head = n1;
        }
        else{
            head.setPrev(n1);
            n1.setNext(head);
            head= n1;
        }

    }

    public Node2 removeEnd(){
        Node2 temp = head;
        if( head.getNext()== null){
            tail =null;
        }
        else{
            head.getNext().setPrev(null);
        }
        head = head.getNext();

        return temp;
    }

    public void addLast(int data){
        Node2 n2 = new Node2(data);

        if( isEmpty()){
            head = n2;
            n2.setPrev(tail);
            tail = n2;
        }
        else{
            n2.setPrev(tail);
            tail.setNext(n2);
            tail = n2;
        }

    }

    public Node2 removeFirst(){
        Node2 temp =tail;
        if( head.getNext()==null){
            head=null;
        }
        else{
            tail.getPrev().setNext(null);
        }
        tail = tail.getPrev();
        return temp;
    }

    public void addAfter(int key, int data){
        Node2 current =  head;
        Node2 n1 = new Node2(data);
        while( current.getData() != key){ // run loop while current does not contain key
            if(current ==null){
                System.out.println("Key is not in List");
            }
            current =current.getNext();
        }
        if(current == tail){ // if the key is in the last node
            n1.setNext(null);  // the new node will be the new last item
            tail = n1;
        }
        else{
           n1.setNext(current.getNext()); // the next reference of n1 should point to current's next node
           current.getNext().setPrev(n1); // current's next node should point back (prev reference) to n1 node

        }
        current.setNext(n1); // current's next reference should point towards n1
        n1.setPrev(current); // n1's prev reference assigned to current

    }

    public void removeNode( int key){
        Node2 current = head;
        while( current.getData()!= key ){
            if(current == null){
                System.out.println("Key is not in List");
            }
            current = current.getNext();

        }
        if(current == tail){
           tail = current.getPrev();
           current.getPrev().setNext(null);
        }
        else if( current == head){
            current.getNext().setPrev(null);
            head = current.getNext();

        }
        else{
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
        }

    }

    public void displayDLL(){
        Node2 current = head;
        System.out.println("List: ");
        while(current!= null){
            current.displayNode2();
            current = current.getNext();
        }
        System.out.println();
    }



}

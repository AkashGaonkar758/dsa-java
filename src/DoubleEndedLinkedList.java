public class DoubleEndedLinkedList {

    private Node head; // refernce to head node
    private Node tail;  //refernce to tail node


    public DoubleEndedLinkedList(){
        head = null; //no nodes yet
        tail = null;
    }

    public boolean isEmpty(){
        return head ==null;
    }

    public void addLast(int n){
        Node n1 = new Node(n);

        if( isEmpty()){
            head = n1;
        }
        else {
            tail.setNext( n1);

        }
        tail = n1;



    }

    public int removeFirst(){
        int temp = head.getData();

        if(head.getNext() ==null) {
            tail = null;
        }
        head = head.getNext();
        return temp;

    }

    public void displayDoubleEndedLinkedList(){

        Node n1 = head;

        System.out.println("List:");
        while (n1 != null){
            n1.displayNode();
           n1= n1.getNext();
        }
        System.out.println();
    }


}

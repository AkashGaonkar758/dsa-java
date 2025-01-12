public class SortedList {
    private Node head;

    public SortedList(){
        head = null;
    }

    public boolean isEmpty(){
        return(head ==null);
    }

    public void add(int n){
        Node n1 = new Node(n);
        Node current = head;
        Node previous = null;
        while ( current!= null && n>current.getData()){
            previous = current; // assign previous to current node
            current = current.getNext(); // move current by 1
        }
        if( current == head) { // check if current node is till head node
            n1.setNext(head);
            head = n1;

        }
        else{
            previous.setNext(n1);
            n1.setNext(current);
        }

        }

        public Node remove(){
        Node temp = head;
        head= head.getNext();
        return temp;

        }

        public void displaySortedList(){
        System.out.println("List: ");
        Node n1 = head;
        while( n1!= null){
            n1.displayNode();
            n1 = n1.getNext();
        }
        System.out.println();
        }


    }


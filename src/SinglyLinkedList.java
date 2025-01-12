public class SinglyLinkedList {

    //Single SinglyLinkedList

    private Node head; //head


    public SinglyLinkedList(){
        head = null; //assign null value;
    }

    public boolean isEmpty(){
        return (head==null);
    }

    public void addFirst(int n){
        Node l1= new Node(n);// make new Node object
        l1.setNext( head); // assign next to old head
        head = l1; // make l1 the head Node
    }

    public int removeFirst(){
        Node temp = head;
        head = head.getNext(); //
        return temp.getData() ;

    }

    public Node find(int d){
        Node l1 =head;

        while(!(l1.getData()==d)){

            if( l1.getNext()==null){
                return null;
            }
            else{
                l1 = l1.getNext();
            }
        }
        return l1;
    }

    public Node delete(int d){
        Node l1 =head;
        Node previous = head;

        while(!(l1.getData()==d)){

            if( l1.getNext()==null){
                return null;
            }
            else{
                previous = l1;
                l1 = l1.getNext();
            }
        }
        if(l1 == head){
            head = head.getNext();
        }
        else{
            previous.setNext(l1.getNext());
        }

        return l1;
    }

    public void displayList(){
        System.out.println("List:");
        Node l1 = head;
        while(l1 != null){
            l1.displayNode();
            l1=l1.getNext();

        }
    }





}






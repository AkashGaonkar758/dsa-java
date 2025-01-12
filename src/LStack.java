public class LStack {


    //Stack implemented by Linked List

    private SinglyLinkedList l1;

    public LStack(){
        l1= new SinglyLinkedList();
    }

    public int pop(){
        return l1.removeFirst();
    }

    public void push(int n){
        l1.addFirst(n);
    }

    public boolean isEmpty(){
       return l1.isEmpty();
    }

    public void displayLStack(){

         l1.displayList();
    }


}

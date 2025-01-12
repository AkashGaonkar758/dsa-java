public class LQueue {

    private DoubleEndedLinkedList queue ;


    public LQueue(){
        queue = new DoubleEndedLinkedList();
    }

    public void offer(int n){
        queue.addLast(n);
    }

    public int poll(){
        return queue.removeFirst();
    }

    public void displayLQueue(){
        queue.displayDoubleEndedLinkedList();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }



}

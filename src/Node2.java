public class Node2 {

    //Node2 is just a node with data and 2 pointers

    private int data;
    private Node2 next ;
    private Node2 prev;


    public Node2(int n){
        this.data=n;
    }

    public void displayNode2(){
        System.out.println(data);
    }

    public Node2 getNext(){
        return next;
    }

    public Node2 getPrev(){
        return prev;
    }

    public void setNext(Node2 n1 ){
        next = n1;
    }
    public void setPrev( Node2 n1) {
        prev = n1;
    }

    public int getData(){
        return data;
    }
}

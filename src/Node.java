public class Node {
    private int data;
    private Node next ;


    public Node(int n){
        data =n;
    }

    public void displayNode(){
        System.out.println(data);
    }

    public int getData(){
        return data;

    }

    public void setData(int n){
        data = n;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node n1){
        next=n1;
    }






}


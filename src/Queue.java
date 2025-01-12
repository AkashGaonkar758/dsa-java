public class Queue {
    private int size;
    private int front;
    private int back;
    private int[] queueArr;
    //FIFO
    //Queue implemented using an array;

    public Queue( int n){
        size=n+1;
        front =0;
        back=-1;
        queueArr= new int[n+1];
    }

    public void insert(int n){
        if (back == size-1){
            back=-1;
        }
        queueArr[++back]= n;
    }

    public int remove(){
        if( front ==size){
            front =0;
        }
        return queueArr[front++];

    }

    public boolean isFull(){
        return (back+2== front) || (front + size -2== back);
    }
    public boolean isEmpty(){
        return (front == back+1)|| (front+size-1 == back);
    }




}


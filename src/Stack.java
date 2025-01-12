public class Stack {


    //Last In-First Out
    //making a stack using an array
    private int[] stackArr;
    int size ;
    int top;

    public Stack(int s){
        this.stackArr= new int[s];
        size=s;
        top=-1;

    }

    public void push(int n){
        stackArr[++top]= n;
    }

    public int  pop(){

        return stackArr[top--];

    }

    public boolean isEmpty(){
        return (top ==-1);
    }

    public boolean isFull(){
        return (top == (size-1));
    }


}


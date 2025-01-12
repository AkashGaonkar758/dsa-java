public class InsertionSort {

    private int[] arr;
    public InsertionSort(int[] arr){
        this.arr= arr;
    }

    public void iSort(){
        for( int i=1; i<arr.length; i++ ){ //Outer Loop
            int temp = arr[i]; // create temp variable
            while (i>0 && temp<arr[i-1]){ // while loop to find postion of arr[i-1]
                arr[i]=arr[i-1]; // move item to the right
                i--; //move pointer left
            }
            arr[i]= temp; //insert item
        }
    }

    public void printArray(){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

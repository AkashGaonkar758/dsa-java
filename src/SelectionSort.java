public class SelectionSort {

    private int[] arr;

    public SelectionSort( int[] arr){
        this.arr = arr;
    }

    public void sSort(){
        for( int i=0; i<arr.length-1; i++){ //outer loop
            int min=i; //assign variable

            for(int j=i+1; j<arr.length; j++) { //inner loop
                if (arr[min] > arr[j]) { //compare
                    min = j;  //change value of min accordingly
                }
            }
            //swap after finishing inner loop
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }


    public void printsArray(){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

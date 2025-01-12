public class RecursiveBinarySearch {

    private int[] arr;




    public RecursiveBinarySearch(int [] arr,int key){

        this.arr= arr;
        System.out.println(search(0, arr.length-1,key));

    }


    public int search(int low, int high, int key){

        int mid = (low +high)/2;

        if(arr[mid]== key){
            return mid;
        }
        else if(low>high){
            return 0;
        }

        else if ( arr[mid]> key){
            return search(low,mid-1,key);
        }
        else{
            return search(mid+1, high,key);
        }


    }

}

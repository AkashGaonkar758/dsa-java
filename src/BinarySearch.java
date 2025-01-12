public class BinarySearch {
    private int[] arr;

    public BinarySearch(int [] arr) {
        this.arr = arr;
    }

    public int bsearch( int num){
        int low =0;
        int high = arr.length -1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (arr[mid] == num) { // check middle value
                return mid;
            } else if (num > arr[mid]) { // check if greater than middle value
                low = mid + 1; // new lower bound is # after mid
            } else {
                high = mid - 1;// new higher bound is # before mid
            }
        }
        return 0;

    }


}
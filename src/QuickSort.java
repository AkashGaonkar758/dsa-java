public class QuickSort {
    private int [] array;


    public QuickSort(int [] arr){
        this.array= arr;
        sort(0, array.length-1);
    }



    public void sort(int start, int end){


        if ( start - end <10){
            InsertionSort();


        }

        else{
            int median= findmedian(start,end);
            partition(start,median,end);
            
        }
    }

    public int findmedian( int a, int b){

        int mid= a+b/2;

        if(array[a]>array[mid]){
            swap(a,mid);

        }
        if(array[a]> array[b]){
            swap(a,b);
        }

        if(mid>array[b]){
            swap(mid,b);
        }

        swap(mid,b-1); //put pivot at right-1;
        return array[b];


    }

    public void swap( int a, int b){
        int temp = array[a];
        array[a]= array[b];
        array[b]= temp;
    }


    public void partition(int start, int mid, int end){
        int left = start;
        int right= end-1;

        while(true) {

            while (array[++left] < mid) {
                ;
            }
            while (array[--right] > mid) {
                ;

            }

            if( left>=right){
                break;
            }
            else{
                 swap(left,right);
            }
        }
        swap(left,end-1);

    }

    public void InsertionSort(){


        for(int i=1; i<array.length; i++){
            int temp = array[i];
            int j=i;

            for (j=i; j>0 && array[j-1]>temp ;j--) {

                   array[j]= array[j-1];

            }
            array[j]= temp;

        }


    }
    public void display(){
        for (int i=0;i<array.length; i++){
            System.out.println(array[i]);
        }
    }










}

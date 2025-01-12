import java.lang.reflect.Array;

public class MergeSort {


    private int [] array;
    private int [] copy;

    public MergeSort(int [] arr){
        this.array= arr;
         copy = new int[arr.length];
         merge(copy, 0,arr.length-1);


    }


    public void merge(int[] arr, int start, int end){

        if( start ==end){
            return;
        }

        else{

            int mid = (start + end)/2;
            merge(arr, start, mid);
            merge(arr, mid+1, end);
            sort( start, end ,mid);

        }


    }

    public void sort( int start, int end, int mid){

        int i= start;

        int nItems= end - start+1;
        int j= mid+1;
        int high = end;
        int x=0;


        while( i<= mid && j <=high){
            if(array[i]< array[j]){
                copy[x]= array[i];
                x++;
                i++;

            }
            else{
                copy[x]= array[j];
                j++;
                x++;
            }
        }

        while(i<= mid){
            copy[x]=array[i];
            x++;
            i++;
        }
        while(j<=end){
            copy[x]=array[j];
            x++;
            j++;
        }

        for (int b=0; b<x;b++){
            array[start+b]= copy[b];

        }



    }

    public void display(){
        for (int i=0;i<copy.length; i++){
            System.out.println(array[i]);
        }
    }




}

public class ShellSort {

    private int [] array;

    public ShellSort(int [] arr){
        this.array= arr;



    }

    public void sort(){

        int temp =0;
        int gap=1;

        int j=0; // inner loop index
        int i=0;// outer loop index

        while(gap < array.length){
            gap =(3*gap) +1;  // calculate max gap using Knuth sequence
        }

        while (gap>0){


            for( i=gap; i<array.length; i++) {
                j = i;
                temp = array[i]; //assign temp variable

                while (j > gap-1 && array[j - gap] >= temp) { // iterate through sequnce based on gap size and index
                    array[j] = array[j - gap];
                    j -=gap;

                }
                array[j] = temp;
            }

            gap = (gap-1)/3; // next smaller gap;
        }
    }

    public void display(){
        for (int i=0;i<array.length; i++){
            System.out.println(array[i]);
        }
    }



}

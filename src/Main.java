import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        /*BubbleSort trial1 = new BubbleSort(new int[]{9,8,7,6,5,4,3,22,6,7,7,8});
        trial1.sort();
        trial1.printArray();

        //---------------------------------------------------------------------------

        BinarySearch trial2 = new BinarySearch(new int[]{1,3,5,6,7,8,9,11,23,56,78,908});
        int x= trial2.bsearch(7);
        System.out.println(x);
        //---------------------------------------------------------------------------


       SelectionSort trial3= new SelectionSort(new int[]{9,8,7,6,5,4,5,2,6,7,7,8});
       trial3.sSort();
       trial3.printsArray();
       //---------------------------------------------------------------------------


       InsertionSort trial4= new InsertionSort(new int[]{9,8,7,6,5,4,5,2,6,7,7,8});
       trial4.iSort();
       trial4.printArray();
       //---------------------------------------------------------------------------

        Stack
        Stack a = new Stack(7);
        a.push(53);
        a.push(1000);
        a.push(5);
        a.push(59);
        a.push(46);
        a.push(50);
        a.push(0);

        while(!a.isEmpty()){
            System.out.println(a.pop());
        }
        */
        //---------------------------------------------------------------------------

        /*Queue implemented using an array
        Queue q1= new Queue(5);
        q1.insert(32);
        q1.insert(0);
        q1.insert(55);
        q1.insert(20);
        q1.insert(369);

        while(!q1.isEmpty()){
            System.out.println(q1.remove());
        }*/

        //---------------------------------------------------------------------------

       /* SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(20);
        list.insertFirst(222);
        list.insertFirst(87);
        list.insertFirst(0);
        list.insertFirst(9);

        list.displayList();
        System.out.println(list.find(44));
        System.out.println(list.find(0));

        Node l = list.delete(0);


        while(!list.isEmpty()){
            System.out.print("Deleted ");
            list.deleteFirst().displayNode();
        }
        }
        */

        //---------------------------------------------------------------------------

        /*
        //Stack implemented using a Singly-LinkedList


        LStack l1 = new LStack();
        l1.push(456);
        l1.push(45);
        l1.push(6);
        l1.push(-2);
        l1.push(10);

        l1.displayLStack();

        l1.pop();
        l1.pop();

        l1.displayLStack();
        */

        //--------------------------------------------------------------------------------

        //Queue implemented using Double Ended Linked List

       /* LQueue q1 = new LQueue();

        q1.offer(928921);
        q1.offer(9);
        q1.offer(12);

        q1.displayLQueue();

        q1.offer(92);
        q1.offer(58);

        q1.displayLQueue();
        System.out.println(q1.poll());

        q1.displayLQueue();

        */
        //---------------------------------------------------------------------------------------

        //Sorted Linked List
        /*

        SortedList list = new SortedList();

        list.add(2);
        list.add(8);
        list.add(3);
        list.add(1);
        list.add(10);

        list.displaySortedList();

        list.remove();
        list.displaySortedList();
        */
        //-------------------------------------------------------------------------------------

       /* DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst(23);
        list.addFirst(2);
        list.addFirst(15);

        list.addLast(12);
        list.addLast(1);

        list.displayDLL();

        list.removeFirst();
        list.removeEnd();
        list.displayDLL();
        list.removeNode(2);

        list.displayDLL();

        list.addAfter(23,100);
        list.displayDLL();

        */
        //-----------------------------------------------------------------------------------------------------
/*
        int arr[] = {2,5,7,9,10,45,789,1000};

        RecursiveBinarySearch trial1 = new RecursiveBinarySearch(arr,45);
        //-----------------------------------------------------------------------------------------------------
/*

 */
        /*
        int[] arr = {200,56,78,45,67,34,2,134,54,33,90,78,56};


        MergeSort trial = new MergeSort(arr);
        trial.display();
        //-----------------------------------------------------------------------------------------------------
/*

         */
        /*
        int[] arr = {200,56,78,45,67,34,2,134,54,33,90,78,56};


        ShellSort trial = new ShellSort(arr);
        trial.sort();
        trial.display();
        //-----------------------------------------------------------------------------------------------------
/*

         */

        /*

        int[] arr = {200,56,78,45,67,34,2,134,54,45,6,7,87,89,5,2,3};
        QuickSort trial = new QuickSort(arr);
        trial.display();
        //-----------------------------------------------------------------------------------------------------
/*


        HashMap <String,Integer> empIds = new HashMap<>();

         */

























    }
}
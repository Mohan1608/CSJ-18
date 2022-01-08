package cj.Array;

public class A1 {
    int[] a=new int[]{1,2,3,4,5};

    public static void main(String[] args) {
        //Array declaration
        int[] arr1;
        //Array Creation/definition
        arr1=new int[5];
        //Array Initialization
        arr1[0]=2;
        arr1[1]=1;
        arr1[2]=2;
        arr1[3]=4;
        arr1[4]=6;

        //Array declaration and definition in one line
        int[] arr2=new int[5];

        //Array declaration with initialization in one line
        arr2=new int[]{1,2,2,4,5,6};


  //    Array declaration
        int[] a=new int [5];
        // Array initialization
        a= new int[]{1, 2, 3, 4, 5,6};
        //to find out the length or size of array
        System.out.println(a.length);

        /*to print all index value/Array Elements of array we have two types
        1.by using for loop
        2.by using for ecah loop*/


/*      1.by using for loop     */
        System.out.print("The Array elements are :");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println();
/*      2.By using for-each loop*/
        for(int element: a){
            System.out.println(element);
        }
    }
}

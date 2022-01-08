package cj.Array;

public class A25 {
    public static void main(String[] args) {
        int[] arraya={1,2,3,4,5,6,7,8,9};
        int[] arrayb={1,5,3,4,5,6,7,8,9};
        checkEquqlity(arraya,arrayb);

    }
    public static void checkEquqlity(int[] array1,int[] array2){
       boolean isEqual=true;
        if (array1.length== array2.length) {
            for (int j = 0; j < array2.length; j++) {
                    if (array1[j]!=array2[j]) {
                       /* System.out.println("The arrays are equal");*/
                        isEqual=false;
                        break;
                    }


            }
            if (isEqual == true) {
                System.out.println("The arrays are same");
            }
            else {
                System.out.println("The arrays are not same");
            }
        }
        else {
            System.out.println(" The size of the Araay are not same ");
        }
    }
}

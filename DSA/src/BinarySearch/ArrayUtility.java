package BinarySearch;

import java.util.Scanner;

public class ArrayUtility {

    public static int[] createArray( ){

        Scanner input=new Scanner(System.in);
        int size;
        System.out.print("Enter the size of Array :");
        size=input.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter the element of Array : ");
        int i=0;
        while (i < arr.length){
            arr[i]=input.nextInt();
            i++;
        }
        return arr;
    }
}

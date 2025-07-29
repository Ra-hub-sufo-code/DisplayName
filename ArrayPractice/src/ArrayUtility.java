import java.util.Scanner;

public class ArrayUtility {
    public static int[] insertArray(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size=scanner.nextInt();
        int[] arr=new int[size];

        System.out.println("Enter the element: ");
        for (int i=0; i <size; i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
}

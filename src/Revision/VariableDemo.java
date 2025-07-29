package Revision;

import java.util.Scanner;

public class VariableDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*System.out.print("Enter the number: ");
        int num=scanner.nextInt();
        VariableDemo variableDemo=new VariableDemo();
        variableDemo.isOdd(num);
*/
        VariableDemo variableDemo=new VariableDemo();
        int[] arr={23,765,234,78};
        //variableDemo.findEvenOddInArr(arr);

        System.out.print("Enter the name: ");
        String string=scanner.nextLine();
        StringBuilder stringBuilder=new StringBuilder(string);
        variableDemo.firstCharIsUpperCase(stringBuilder);
        System.out.println(stringBuilder);

    }

    public void isOdd(int num){
        int x=num/2;
        if (x*2==num){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }

    public void findEvenOddInArr(int[] nums){
        for (int num=0; num<nums.length; num++){
            if (nums[num]%2==0){
                System.out.println(num+"th index element is even,Element is: "+nums[num]);
            }
            else {
                System.out.println(num+"th index element is odd,Element is: "+nums[num]);
            }

        }
    }

    public void firstCharIsUpperCase(StringBuilder str){

        if (97<=str.charAt(0)&&str.charAt(0)<=122){
            str.setCharAt(0,(char) ((str.charAt(0))-32));
        }
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==32){
                str.setCharAt(++i,(char) ((str.charAt(i))-32));
            }
        }
    }
}

package BinarySearch;

// ceiling Number -> The smallest number greater than or equal to a given real number
import java.util.Scanner;

public class FindCeilingNum {
    public static void main(String[] args) {
        int[] num=ArrayUtility.createArray();
        Scanner in=new Scanner(System.in);

        int tar,res;
        System.out.println("Enter the target number : ");
        tar=in.nextInt();
        res= findCeilingEle(num,tar);
        if(res==-1){
            System.out.println("Not Ceiling number found in Array");
        }
        else {
            System.out.println("Ceiling number of Target Element is :"+res);
        }
    }

    public static int findCeilingEle(int[] arr,int target){

       // ceiling Number -> The smallest number greater than or equal to a given real number

        int mid,low=0,high=arr.length-1;
        while (low <= high){
            mid=(low+high)/2;
            if (arr[mid] == target){
                return arr[mid];
            }

            else if (low == high){
                if (arr[low] < target){
                    return -1;
                }
                else {
                    return arr[low];
                }
            }

            else if (arr[mid] < target){
                low=mid+1;
            }

            else {
                high=mid;
            }
        }
        return -1;
    }

}

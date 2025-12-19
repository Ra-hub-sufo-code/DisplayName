package BinarySearch;

public class FindElement {

    public static void main(String[] args) {
        int[] num=ArrayUtility.createArray();
        System.out.println("The target Element found :"+findEle(num,34));
    }

    public static boolean findEle(int[] arr,int target){
        int low=0,high= arr.length-1;
        int mid;
        while (low <= high){
            mid=(low+high)/2;
            if (arr[mid]==target){
                return true;
            }

            else if (arr[mid] < target){
                high=mid-1;
            }

            else {
                low=mid+1;
            }
        }
        return false;
    }
}

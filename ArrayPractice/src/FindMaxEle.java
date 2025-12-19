public class FindMaxEle {
    public static void main(String[] args) {
        int[] numbs=ArrayUtility.insertArray();
        /*int maxEle=findMaxEle(numbs);
        int minEle=findMinEle(numbs);
        System.out.println("Max Element is: "+minEle);
        reverseArray(numbs);
        System.out.print("Reverse Array is: [");
        for (int ele:numbs){
            System.out.print(ele);
        }
        System.out.println("]");*/

        int addAllEle=addAllEle(numbs);
        System.out.println("Addition of all Element is: "+addAllEle);

    }

    public static int findMaxEle(int[] arr){
        int max=0;
        for (int i=0; i < arr.length; i++){
            if(max < arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static int findMinEle(int[] arr){
        int min=arr[0];
        for (int i=0; i < arr.length; i++){
            if(min > arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static void reverseArray(int[] arr){
        for (int i=0; i < arr.length; i++){
            for (int j=0; j < (arr.length-i-1); j++) {
                int swp;
                swp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=swp;
            }
        }
    }

    public static int addAllEle(int[] arr){
        int add=0;
        for (int i=0; i < arr.length; i++){
            add +=arr[i];
        }
        return add;
    }
}

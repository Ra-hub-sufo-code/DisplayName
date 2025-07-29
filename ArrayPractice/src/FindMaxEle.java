public class FindMaxEle {
    public static void main(String[] args) {
        int[] nums=ArrayUtility.insertArray();
        int maxEle=findMaxEle(nums);
        System.out.println("Max Element is: "+maxEle);
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
}

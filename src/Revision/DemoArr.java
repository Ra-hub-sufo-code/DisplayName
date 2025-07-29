package Revision;

public class DemoArr {

    public static void main(String[] aregs) {
        int[] arr = {2, 56, 7, 8};
        DemoArr d=new DemoArr();
        int[] newArr = d.twoSum(arr, 15);
        System.out.println("Answer :");
        for (int value : newArr) {
            System.out.println(value);
        }
    }


    public int[] twoSum(int[] nums, int target) {
        int[] srr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    srr[0] = i;
                    srr[1] = j;
                    return srr;
                }
            }
        }
        return srr;
    }
}
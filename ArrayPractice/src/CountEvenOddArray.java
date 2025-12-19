public class CountEvenOddArray {
    public static void main(String[] args) {
        int[] elem=ArrayUtility.insertArray();
        CountEvenOddArray count=new CountEvenOddArray();
        //count.countEvenOdd(elem);
        count.printAlternateEle(elem);
    }

    public void countEvenOdd(int[] arr){
        int even=0,odd=0;
        for (int ele:arr){
            if(ele%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Odd element occurrence is: "+odd);
        System.out.println("Even element occurrence is: "+even);
    }

    public void printAlternateEle(int[] arr){
        System.out.print("Alternate Element is: ");
        for (int i=0; i <arr.length; i++){
            if (i%2!=0){
                continue;
            }
            System.out.print(arr[i]+" ");
        }
    }
}

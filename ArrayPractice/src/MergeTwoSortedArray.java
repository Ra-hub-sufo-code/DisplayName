public class MergeTwoSortedArray {
    public static void main(String[] args) {
//        int[] elem1=ArrayUtility.insertArray();
//        int[] elem2=ArrayUtility.insertArray();

        int[] elem1={8,7,6,5};
        int[] elem2={4,3,2,1};
        int[] mergeArr=mergeTwoArray(elem1,elem2);
        System.out.print("Merge Array is: ");
        for (int ele:mergeArr){
            System.out.print(ele+" ");
        }
    }

    public static int[] mergeTwoArray(int[] arr1,int[] arr2){
        int size=arr2.length+arr1.length;
        int i=0,j=0,k=0;
        int[] newArr=new int[size];

        if (arr1[i] < arr2 [j]){
            while (k < newArr.length){
                if (i <= (arr2.length-1)){
                    newArr[k]=arr1[i];
                    i=i+1;
                }
                else {
                    if (j <= (arr2.length-1)){
                        newArr[k]=arr2[j];
                        j=j+1;
                    }
                }
                k++;
            }

        }
        else {
            while (k < newArr.length){
                if (i <= (arr2.length-1)){
                    newArr[k]=arr1[i];
                    i=i+1;
                }
                else {
                    if (j <= (arr2.length-1)){
                        newArr[k]=arr2[j];
                        j=j+1;
                    }
                }
                k++;
            }
        }

        return newArr;
    }
}

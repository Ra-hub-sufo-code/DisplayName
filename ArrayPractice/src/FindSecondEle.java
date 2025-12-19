public class FindSecondEle {
    public static void main(String[] args) {
        int[] els =ArrayUtility.insertArray();
        FindSecondEle secondEle=new FindSecondEle();
//        int secMaxEle=secondEle.findSecondLargetEle(els);
//        System.out.println("Second Largest Element is: "+secMaxEle);

        int secMinEle=secondEle.findSecondSmallestEle(els);
        System.out.println("Second smallest Element is: "+secMinEle);
    }

    public int findSecondLargetEle(int[] arr){
        int secLar=arr[0],max=arr[0];
        for (int ele:arr){
            if (max < ele){
                max=ele;
            }
        }

        for (int ele:arr){
            if( max > ele && ele >secLar){
                secLar=ele;
            }
        }
        return secLar;
    }

    public int findSecondSmallestEle(int[] arr){
        int secSma=arr[0],min=arr[0];
        for (int ele:arr){
            if (min > ele){
                min=ele;
            }
        }

        if (secSma >= min){
            secSma=arr[1];
        }
        for (int ele:arr){
            if (min < ele && secSma > ele){
                secSma=ele;
            }
        }
        return secSma;
    }
}

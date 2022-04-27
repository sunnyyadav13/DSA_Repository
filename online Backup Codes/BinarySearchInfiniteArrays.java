/**
 * *Created by--> Sunny Yadav
 * *Date-Time: 27/04/2022-14:07
 * *Project-Name: online Backup Codes
 */

public class BinarySearchInfiniteArrays {
    public static void main(String[] args) {
        int[] arr= new int[]{ 3,5,7,9,10,90,100,130,140,160,70};
        int target=10;

        System.out.println(findAns(arr,target));
    }

    public static int findAns(int[] arr,int target){
        int start=0,end=1;

        while(target>arr[end]){  // do not need to find search in chunk untill this loop break
            int temp=end+1;

            end=end+(end-start+1)*2;
            start=temp;

        }

        return  binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}

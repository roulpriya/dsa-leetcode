package impjavaque;

public class binaryrecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,33,44,55};
        int target = 6;
        int ans = binary(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }

    static int binary(int[] arr, int target, int s, int e){
        if(s>e)
            return -1;

        int mid = s + (e-s)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(target < arr[mid]){
            return binary(arr,target, s, mid-1);
        }
        return binary(arr, target, mid, e );
    }
}

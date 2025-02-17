public class recursionIntro {
    //Recusrion is a method in whicha function calss itself

    //types of recursion
    //Direct Recusrion: Afunction calls itself
    //Indirect Recursion:A functioncalls another function which in turn calls
    public static int binarySearch(int[]arr,int target,int left,int right){
        if(left>right){
            return -1;
        }
        int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                return binarySearch(arr, target, left, mid-1);
            }else{
                return binarySearch(arr, target, mid+1, right);
            }
    }
    public static void main(String[] args) {
        int[]arr={11,15,18,20,21,22};
        int target=18;
        int index=binarySearch(arr, target, 0, arr.length-1);
        System.out.println(index);
    }
}

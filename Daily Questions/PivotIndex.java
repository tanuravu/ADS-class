public class PivotIndex {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int result =PivotIndex.pivot(arr);
        System.out.println(result);
    }

    public static int pivot(int[] nums){
        int leftSum=0;int rightSum=0;
        for(int i=0;i<nums.length;i++){
            rightSum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
 
    }
}

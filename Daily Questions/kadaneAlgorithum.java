public class kadaneAlgorithum {
    public static void main(String[] args) {
        //complexity BigO(n)
        /* Steps:
            1. Initialization:
            2. Iteration
         */
        //eg: [1,-2,3,4,-1,2,1,-5,4] 
        /* start:currentSum=0,maxSum=Integer.min_value
            fisrtEle:currentSum=max(1,0+1)=1,maxSum=max(_In,1)1
            secondEle(-2):currentSum(-2,1-2)=-1,maxSum=max(1,-1)=1
            thirdEle(3):currentSum(3,-1+3)=3 maxSim=3
            fourthEle(4):currentSum(4,3+4)=7,maxSum(3,7)=7 and so on
         */
        int[] nums={1,-2,3,4,-1,2,1,-5,4};
        System.out.println("Maximun SubArray Sum"+" "+maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int num:nums){
            currentSum=Math.max(num,currentSum+=num);
            maxSum=Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

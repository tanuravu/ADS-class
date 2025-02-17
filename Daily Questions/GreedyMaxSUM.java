public class GreedyMaxSUM {
        public static void main(String[] args) {
            int[] nums={1,-2,3,4,-1,2,1,-5,4};
            System.out.println("Maximun SubArray Sum"+" "+maxSubArray(nums));
        }
        public static int maxSubArray(int[] nums){
            int currentSum=0;
            int maxSum=Integer.MIN_VALUE;
            for(int num:nums){
                currentSum=Math.max(num,currentSum+=num);
                if(currentSum<0){
                    currentSum=0;
                }
                maxSum=Math.max(maxSum, currentSum);
            }
            return maxSum;
        }
    }
    

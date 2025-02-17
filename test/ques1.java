public class ques1 {
        public static int longestSubarrayWithSumK(int[] nums, int k) {
            int left = 0;
            int right = 0;
            int currentSum = 0;
            int maxLength = 0;
    
            while (right < nums.length) {
                currentSum += nums[right];
    
                while (currentSum > k && left <= right) {
                    currentSum -= nums[left];
                    left++;
                }
    
                if (currentSum == k) {
                    maxLength = Math.max(maxLength, right - left + 1);
                }
    
                right++;
            }
    
            return maxLength;
        }
    
        public static void main(String[] args) {
            int[] nums={1,2,3,1,1,1,5,-1};
            int k=5;
            System.out.println(longestSubarrayWithSumK(nums, k));
    }
}
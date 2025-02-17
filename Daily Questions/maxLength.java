public class maxLength {
    public static int MaximumLength(int[]arr){
        int len=arr.length;
        int maximumlen=0;
        for(int st=0;st<len;st++){
            int sum=0;
            for(int end=st;end<len;end++){
                sum+=arr[end];
                if(sum==0){
                    maximumlen=Math.max(maximumlen, end-st+1);
                }
            }
        }
        return maximumlen;
    }
    public static void main(String[] args) {
        int[] arr={1,0,-4,3,1,0};
        System.out.println(MaximumLength(arr));
    }
}

           
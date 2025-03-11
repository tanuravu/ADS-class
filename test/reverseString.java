public class reverseString {
    public static String reverse(String s){
        char[] charArray=s.toCharArray();
        int left=0,right=charArray.length-1;
        while(left<right){
            char t=charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=t;
            left++;
            right--;
        }
        return new String(charArray);
    }
    public static void main(String[] args){
        String string="HelloWorld";
        System.out.println("Original:"+ string);
        System.out.println("Reverse:"+reverse(string));
    }
}

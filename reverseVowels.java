import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class reverseVowels {
    public static void main(String[] args) {
        reverseVowels r=new reverseVowels();
        String s1="hello"; 
        System.out.println("Input:"+s1);
        System.out.println("Output:"+r.reverseVowels(s1));
       }
    public String reverseVowels(String s){
        if(s==null || s.length()==0) return s;
        Set<Character>vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[]chars=s.toCharArray() ;
        int left=0,right=chars.length-1;
        while(left<right){
            while((left<right && !vowels.contains(chars[left]))){
                left++;
            }
            while((left<right&&!vowels.contains(chars[right]))){
                right--;
            }
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}

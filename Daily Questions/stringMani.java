import java.util.HashMap;
import java.util.stream.Gatherer.Integrator;

public class stringMani{
    public static String minWindow(String s1,String s2){
        if(s1==null||s2==null||s1.length()<s2.length()){
            return "";
        }
        HashMap<Character,Integer>charFreq=new HashMap<>();
        for(char c:s2.toCharArray()){
            charFreq.put(c,charFreq.getOrDefault(c, 0)+1);
        }
        HashMap<Character,Integer>winddowCoun=new HashMap<>();
    int start=0,matched=0,minlength=Integer.MAX_VALUE ;
int minStart=0;
for(int end=0;end<=s1.length();end++){
    char endChar=s1.charAt(end);
    winddowCoun.put(endChar,winddowCoun.getOrDefault(endChar,0)+1);
    if(charFreq.containsKey(endChar)&&winddowCoun.get(endChar).equals(charFreq.get(endChar))){
        matched++;
    }
    while(matched==charFreq.size()){
        if(end-start+1<minlength){
            minlength=end-start+1;
            minStart=start;
        }
        char startChar=s1.charAt(start);
        winddowCoun.put(startChar,winddowCoun.get(startChar)-1);
        if(charFreq.containsKey(startChar)&&
        winddowCoun.get(startChar)<charFreq.get(startChar)){
            matched--;
        }
        start++;
    }
}
return minlength==Integer.MAX_VALUE?"":s1.substring(minStart,minStart+minlength);
}
    
        /* Find the smallest substring in the first string that conatins 
            all characters of the second String?

            we are going to use 2 hashmaps:
            charFreq: to store the frequiency to ecah charavter in s2:
            windowCoun: to store frequency of characters in current window of s1.

            Use two pointers: start and end to denote the current window
            expand the window by moving the end pointer untill all characters in s2 covered

            once a valid  window is found,shrink it form the leftby moving the start
            to minimize the size.
         */
        public static void main(String[] args) {
            String s1="ADOB";
            String s2=
    }
}
public class shortestPalindrome {
    public String shortestPalindrome(String s) {
        String revS = new StringBuilder(s).reverse().toString();  // Reverse the string
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.startsWith(revS.substring(i))) {
                return revS.substring(0, i) + s;  
            }
        }
        return ""; 
    }
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("aacecaaa"));
    }
}

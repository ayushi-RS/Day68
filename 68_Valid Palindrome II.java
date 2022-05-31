class Solution {
    
    public boolean validPalindrome(String s) {
        return palindrome(s, 0, s.length()-1, 0);
    }
    
    //flag represents how many times we delete character
    boolean palindrome(String s, int start, int end, int flag) {
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                flag++;
                if(flag <=1 && palindrome(s, start+1, end, flag))
                    return true;
                
                if(flag <=1 && palindrome(s, start, end-1, flag))
                    return true;
                
                return false;
            }
            else {
                start++;
                end--;
            }
        }
        
        return true;
    }
}